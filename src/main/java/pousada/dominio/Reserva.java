/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.dominio;


import com.sun.istack.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;
import pousada.dominio.enums.FormaPagamentoEnum;
import pousada.dominio.enums.GeneroEnum;

/**
 *
 * @author 2022222760011
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reserva implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name="id_reserva")
    private int idReserva;
    @Column(name="data_check_in")
    private LocalDate dataCheckIn;
    @Column(name="data_check_out")
    private LocalDate dataCheckOut;
    @Column(name="valor_reserva")
    private Double valorReserva;
    @Column(name="deposito_realizado")
    private Double depositoRealizado;
    @Column(name="placa_carro")
    private String placaCarro;
    @Column(name="pagamento_check_in")
    private Double pagamentoCheckIn;
    
    @NotNull
    @Column(name="forma_pagamento")
    private FormaPagamentoEnum formaPagamento;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name="id_meio_transporte")
    private MeioTransporte meioTransporte;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name="id_conheceu_pousada")
    private ConheceuPousada conheceuPousada;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name="id_motivo_viagem")
    private MotivoViagem motivoViagem;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name="id_quarto")
    private Quarto quarto;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;
}
