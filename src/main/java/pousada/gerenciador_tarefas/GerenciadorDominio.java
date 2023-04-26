/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.gerenciador_tarefas;

import pousada.dao.ConexaoHibernate;

/**
 *
 * @author 2022222760011
 */
public class GerenciadorDominio {
    public GerenciadorDominio(){
        ConexaoHibernate.getSessionFactory();
    }
}
