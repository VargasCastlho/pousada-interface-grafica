/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.dominio;


import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;
import pousada.dominio.enums.GeneroEnum;

/**
 *
 * @author 2022222760011
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name="codigo_cliente")
    private int codigoCliente;
    private String nome;
    private String celular; 
    private String profissao;
    private String nacionalidade;
    @Column(name="data_nasc")
    private LocalDate dataNasc;
    private String identidade;
    private String cpf;
    private String email;
    private String residencia;
    private String cidade;
    private String uf;
    private String pais;
    private GeneroEnum genero;
    
    
    
}
