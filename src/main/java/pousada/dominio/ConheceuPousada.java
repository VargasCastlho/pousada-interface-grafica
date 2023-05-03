/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author 2022222760011
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ConheceuPousada {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name="id_conheceu_pousada")
    private int idConheceuPousada;
    
    private String descricao;
}
