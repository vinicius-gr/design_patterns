/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Vinicius
 */
public class Template {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Poupança();
        c1.abreConta();
        
        System.out.println("\n\n");
        
        Conta c2 = new Corrente();
        c2.abreConta();
        
        System.out.println("\n\n");
        
        Conta c3 = new Juridica();
        c3.abreConta();
    }
    
}
