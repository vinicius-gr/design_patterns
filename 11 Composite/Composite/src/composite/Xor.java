
package composite;

public class Xor extends Operador{
    public Xor(ExpressaoBooleana op1, ExpressaoBooleana op2){
        super(op1, op2);
    }
    
    public boolean operacao(){
        return getOp1().operacao() ^ getOp2().operacao();
    }
}   
    
