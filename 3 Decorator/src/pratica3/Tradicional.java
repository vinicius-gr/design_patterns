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
public class Tradicional extends Sanduiche{
    
    private float preco = (float) 4.00;
    
    @Override
    public float getPreco(){
        return (float) this.preco;
    }
    
    public Tradicional(){
         descricao = "Pao, Hamburguer, Tomate, Queijo, Alface  ===== Opcionais: ";
    }
}
