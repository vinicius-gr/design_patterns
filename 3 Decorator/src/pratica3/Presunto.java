/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica3;

/**
 *
 * @author a11511BCC019
 */
public class Presunto extends AdicionalDecorator{

    Sanduiche sanduiche;
    
    public Presunto(Sanduiche sanduiche){
        this.sanduiche = sanduiche;
    }
   
    public String getDescricao() {
        return (sanduiche.getDescricao() + "Presunto, ");
    }

    public float getPreco() {
        return (float) (1.00 + sanduiche.getPreco());
    }
    
}
