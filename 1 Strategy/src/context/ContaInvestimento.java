/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import strategy.Ch_liberado;
import strategy.M_baixa;
import strategy.M_completa;
import strategy.R_normal;

/**
 *
 * @author a11511BCC019
 */
public class ContaInvestimento extends Conta{
    
	public ContaInvestimento(){
		rentabilidade = new R_normal();
		mensalidade = new M_baixa();
		movimentacao = new M_completa();
		cheque = new Ch_liberado();
	}
	
	public void mostrarDados(){
		System.out.println("\n\nConta Investimento: \n");
		super.mostrarDados();
	}
}

