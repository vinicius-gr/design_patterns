/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import strategy.Ch_bloqueado;
import strategy.M_normal;
import strategy.M_simplificada;
import strategy.R_baixa;

/**
 *
 * @author a11511BCC019
 */
public class ContaSalario extends Conta{
	
	public ContaSalario(){
		rentabilidade = new R_baixa();
		mensalidade = new M_normal();
		movimentacao = new M_simplificada();
		cheque = new Ch_bloqueado();
	}
	
	public void mostrarDados(){
		System.out.println("\n\nConta Salário: \n");
		super.mostrarDados();
	}
}
