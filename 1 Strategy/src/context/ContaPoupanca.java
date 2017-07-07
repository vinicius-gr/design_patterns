/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import strategy.Ch_bloqueado;
import strategy.M_baixa;
import strategy.M_simplificada;
import strategy.R_normal;

/**
 *
 * @author a11511BCC019
 */
public class ContaPoupanca extends Conta{
    
	public ContaPoupanca(){
		rentabilidade = new R_normal();
		mensalidade = new M_baixa();
		movimentacao = new M_simplificada();
		cheque = new Ch_bloqueado();
	}
	
	public void mostrarDados(){
		System.out.println("\n\nConta Poupança: \n");
		super.mostrarDados();
	}
}
