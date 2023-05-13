/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.gerenciador_tarefas;

import java.util.List;
import org.hibernate.HibernateException;
import pousada.dao.GenericDAO;
import pousada.dominio.ConheceuPousada;
import pousada.dominio.MeioTransporte;
import pousada.dominio.MotivoViagem;
import pousada.dominio.Quarto;

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
    
    public int inserirMeioTransporte(String descricao){
        MeioTransporte mT = MeioTransporte.builder().descricao(descricao).build();
        genDAO.inserir(mT);
        return mT.getIdMeioTransporte();
    }
    
    public int inserirConheceuPousada(String descricao){
        ConheceuPousada cP = ConheceuPousada.builder().descricao(descricao).build();
        genDAO.inserir(cP);
        return cP.getIdConheceuPousada();
    }
    
    public int inserirQuarto(int numeroQuarto, int numeroCamas, int numeroArmarios, int numeroFrigobares, Double valorDiaria, String observacoes){
        Quarto q = Quarto.builder().numeroQuarto(numeroQuarto)
                .numeroCamas(numeroCamas).numeroArmarios(numeroArmarios)
                .numeroFrigobares(numeroFrigobares)
                .valorDiaria(valorDiaria).observacoes(observacoes).build();
        genDAO.inserir(q);
        return q.getNumeroQuarto();
    }
    
}
