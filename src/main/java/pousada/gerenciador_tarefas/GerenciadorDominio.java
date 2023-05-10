/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.gerenciador_tarefas;

import java.util.List;
import pousada.dao.ConexaoHibernate;
import pousada.dao.GenericDAO;
import pousada.dominio.MeioTransporte;

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
    
    public List<MeioTransporte> listarMeioTransporte(){
        return genDAO.listar(MeioTransporte.class);
    }
    
}
