/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.gerenciador_tarefas;

import java.util.List;
import org.hibernate.HibernateException;
import pousada.dao.GenericDAO;
import pousada.dominio.MeioTransporte;
import pousada.dominio.MotivoViagem;

/**
 *
 * @author 2022222760011
 */
public class GerenciadorDominio {
    
    
    private static GerenciadorDominio instancia = null;
    public static GerenciadorDominio getInstancia() {
        if (instancia == null)
            instancia = new GerenciadorDominio();
        return instancia;
    }
    
    GenericDAO genDAO = null;
    
    private GerenciadorDominio(){
        genDAO = new GenericDAO();
    }
    
    public List listar(Class classe) throws HibernateException {        
        return genDAO.listar(classe);        
    }
    
    public int inserirMotivoViagem(String descricao){
        MotivoViagem mV = MotivoViagem.builder().descricao(descricao).build();
        genDAO.inserir(mV);
        return mV.getIdMotivoViagem();
    }
    
}
