


package pratica3;



//--- VINICIUS GONZAGA ROCHA _ 11511BCC019 ---




public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sanduiche s1 = new Tradicional();
        s1 = new Presunto(s1);
        
        
        Sanduiche s2 = new Tradicional();
        s2 = new Ovo(s2);
        s2 = new Bacon(s2);
    
        System.out.println("Sanduiche: " + s1.getDescricao());
        System.out.println("\nPreço: " + s1.getPreco());
        
        System.out.println("\n\nSanduiche: " + s2.getDescricao());
        System.out.println("\nPreço: " + s2.getPreco());
    }
    
}
