/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author a11511BCC019
 */
public class Ch_bloqueado implements ChequeEspecial{

    @Override
    public void ch() {
        System.out.println("Cheque Especial Bloqueado");
    }
    
}
