
package composite;

public abstract class Operador implements ExpressaoBooleana{
    private ExpressaoBooleana op1;
    private ExpressaoBooleana op2;
    
    public Operador (ExpressaoBooleana op1, ExpressaoBooleana op2){
        this.op1 = op1;
        this.op2 = op2;
    }
    
    public Operador (ExpressaoBooleana op){
        this.op1 = op;
    }
    
    public ExpressaoBooleana getOp1 (){
        return this.op1;
    }
    
    public ExpressaoBooleana getOp2 (){
        return this.op2;
    }   
}
