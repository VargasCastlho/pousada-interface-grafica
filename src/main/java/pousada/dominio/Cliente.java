/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.dominio;


import com.sun.istack.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
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
@AllArgsConstructor
@Builder
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private int idCliente;
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
    @NotNull
    private GeneroEnum genero;
    
    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reservas;
    
}
