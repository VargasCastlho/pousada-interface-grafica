/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.dominio;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

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
public class Quarto {
    
    @Id
    @Column(name="numero_quarto")
    private int numeroQuarto;
    @Column(name="numero_camas")
    private int numeroCamas;
    @Column(name="numero_armarios")
    private int numeroArmarios;
    @Column(name="numero_frigobares")
    private int numeroFrigobares;
    @Column(name="valor_diaria")
    private Double valorDiaria;
    private String observacoes;
    
    @OneToMany(mappedBy = "quarto")
    private List<Reserva> reservas;
    
    @Override
    public String toString() {
        return Integer.toString(numeroQuarto);
    }
}
