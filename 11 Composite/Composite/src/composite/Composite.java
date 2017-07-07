package composite;

public class Composite {

    public static void main(String[] args) {
        ExpressaoBooleana e;
        e = new And(new And(new Operando(true), new Xor(new Operando(false), new Operando(true))), new Not(new Operando(false)));
        System.out.println(e.operacao());
    }
    
}
