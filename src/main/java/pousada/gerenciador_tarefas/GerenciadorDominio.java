/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.gerenciador_tarefas;

import com.sun.istack.NotNull;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import org.hibernate.HibernateException;
import pousada.dao.GenericDAO;
import pousada.dominio.Cliente;
import pousada.dominio.ConheceuPousada;
import pousada.dominio.MeioTransporte;
import pousada.dominio.MotivoViagem;
import pousada.dominio.Quarto;
import pousada.dominio.Reserva;
import pousada.dominio.enums.FormaPagamentoEnum;
import pousada.dominio.enums.GeneroEnum;

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
    
    public int inserirCliente(String nome, String celular, String profissao, 
            String nacionalidade, LocalDate dataNasc, String identidade, String cpf, 
            String email, String residencia, String cidade, String uf, 
            String pais, GeneroEnum genero){
        Cliente c = Cliente.builder().nome(nome).celular(celular).profissao(profissao)
                .nacionalidade(nacionalidade).dataNasc(dataNasc).identidade(identidade)
                .cpf(cpf).email(email).residencia(residencia).cidade(cidade).uf(uf)
                .pais(pais).genero(genero).build();
        genDAO.inserir(c);
        return c.getIdCliente();
    }
    
    public int inserirReserva(LocalDate dataCheckIn, 
            LocalDate dataCheckOut, Double valorReserva, Double depositoRealizado, 
            String placaCarro, Double pagamentoCheckIn, 
            FormaPagamentoEnum formaPagamento, MeioTransporte meioTransporte, 
            ConheceuPousada conheceuPousada, MotivoViagem motivoViagem, 
            Quarto quarto, Cliente cliente){
        Reserva r = Reserva.builder().dataCheckIn(dataCheckIn)
                .dataCheckOut(dataCheckOut).valorReserva(valorReserva)
                .depositoRealizado(depositoRealizado).placaCarro(placaCarro)
                .pagamentoCheckIn(pagamentoCheckIn).formaPagamento(formaPagamento)
                .meioTransporte(meioTransporte).conheceuPousada(conheceuPousada)
                .motivoViagem(motivoViagem).quarto(quarto).cliente(cliente).build();
        
        genDAO.inserir(r);
        return r.getIdReserva();
    }
    
}
