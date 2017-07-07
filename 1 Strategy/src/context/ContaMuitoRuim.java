package context;

import strategy.Ch_bloqueado;
import strategy.M_altissima;
import strategy.M_simplificada;
import strategy.R_baixa;

public class ContaMuitoRuim extends Conta{
	
	public ContaMuitoRuim(){
		rentabilidade = new R_baixa();
		mensalidade = new M_altissima();
		movimentacao = new M_simplificada();
		cheque = new Ch_bloqueado();
	}
	
	public void mostrarDados(){
		System.out.println("\n\nConta Muito Ruim: \n");
		super.mostrarDados();
	}
}
