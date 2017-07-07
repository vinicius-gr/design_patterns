
package composite;

public class Or extends Operador{
    public Or(ExpressaoBooleana op1, ExpressaoBooleana op2){
        super(op1, op2);
    }
    
    public boolean operacao(){
        return getOp1().operacao() || getOp2().operacao();
    }
}   
    
