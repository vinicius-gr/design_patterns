
package composite;

public class Not extends Operador{
    public Not(ExpressaoBooleana op){
        super(op);
    }
    
    public boolean operacao(){
        return !getOp1().operacao();
    }
}   