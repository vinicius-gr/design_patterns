/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import strategy.Ch_liberado;
import strategy.M_completa;
import strategy.M_normal;
import strategy.R_baixa;

/**
 *
 * @author a11511BCC019
 */
public class ContaCorrente extends Conta{
    
	public ContaCorrente(){
		rentabilidade = new R_baixa();
		mensalidade = new M_normal();
		movimentacao = new M_completa();
		cheque = new Ch_liberado();
	}
	
	public void mostrarDados(){
		System.out.println("\n\nConta Corrente: \n");
		super.mostrarDados();
	}
}
