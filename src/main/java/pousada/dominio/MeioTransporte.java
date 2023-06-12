/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.dominio;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
public class MeioTransporte {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name="id_meio_transporte")
    private int idMeioTransporte;
    
    private String descricao;
    
    @Override
    public String toString() {
        return descricao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MeioTransporte other = (MeioTransporte) obj;
        if (this.idMeioTransporte != other.idMeioTransporte) {
            return false;
        }
        return Objects.equals(this.descricao, other.descricao);
    }
    
    
}
