/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada.dominio.enums;

/**
 *
 * @author 2022222760011
 */
public enum GeneroEnum {
    MASCULINO(0),
    FEMININO(1);
   
    private int value;
    
    private GeneroEnum(int value){
        this.value = value;
    }
}
