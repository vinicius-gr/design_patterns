
package context;

import strategy.ChequeEspecial;
import strategy.Mensalidade;
import strategy.Movimentacao;
import strategy.Rentabilidade;

public abstract class Conta {
    ChequeEspecial cheque;
    Mensalidade mensalidade;    
    Movimentacao movimentacao;
    Rentabilidade rentabilidade;
        
    int nro;
    int senha;
    String cliente;
    double saldo;

    public void mostrarDados(){
    	this.rentabilidade.rent();
        this.mensalidade.mens();
        this.movimentacao.mov();
        this.cheque.ch();
    }
}
