/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author 2022222760011
 */
public class GenericDAO {
    
    public void inserir(Object obj){
        
        Session sessao = null;
        try{
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.save(obj);

            sessao.getTransaction().commit();
            sessao.close();
        } catch(HibernateException e){
            if(sessao!=null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
    }
    
    public void alterar(Object obj){
        
        Session sessao = null;
        try{
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.update(obj);

            sessao.getTransaction().commit();
            sessao.close();
        } catch(HibernateException e){
            if(sessao!=null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
    }
    
    public void excluir(Object obj){
        
        Session sessao = null;
        try{
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.delete(obj);

            sessao.getTransaction().commit();
            sessao.close();
        } catch(HibernateException e){
            if(sessao!=null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
    }
    
    public List listar(Class classe){
        
        Session sessao = null;
        List lista = null;
                
        try{
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaQuery consulta = sessao.getCriteriaBuilder()
                    .createQuery(classe);
            consulta.from(classe);
            lista = sessao.createQuery(consulta).getResultList();

            sessao.getTransaction().commit();
            sessao.close();
        } catch(HibernateException e){
            if(sessao!=null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
        return lista;
    }
}
