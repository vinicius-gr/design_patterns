
package composite;

public class Operando implements ExpressaoBooleana{
    
    private boolean conteudo;
    
    public Operando(boolean conteudo){
        this.conteudo = conteudo;
    }
    
    public boolean operacao() {
        return this.conteudo;
    }
    
}
