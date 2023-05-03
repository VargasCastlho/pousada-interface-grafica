/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.dominio.enums;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author 2022222760011
 */
@Getter
public enum FormaPagamentoEnum {
    DINHEIRO(0),
    CARTAO_DE_DEBITO(1),
    TRANSFERENCIA_BANCARIA(2);
   
    private int value;
    
    private FormaPagamentoEnum(int value){
        this.value = value;
    }
}
