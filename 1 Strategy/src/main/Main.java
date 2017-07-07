


package main;



//--- VINICIUS GONZAGA ROCHA _ 11511BCC019 ---




import context.Conta;
import context.ContaCorrente;
import context.ContaInvestimento;
import context.ContaMuitoRuim;
import context.ContaPoupanca;
import context.ContaSalario;

public class Main {

    public static void main(String[] args) {
    	Conta corrente = new ContaCorrente();
    	Conta investimento = new ContaInvestimento();
    	Conta poupanca = new ContaPoupanca();
    	Conta salario = new ContaSalario();
    	Conta ruim = new ContaMuitoRuim();
    	
    	corrente.mostrarDados();
    	salario.mostrarDados();
    	poupanca.mostrarDados();
    	investimento.mostrarDados();
    	ruim.mostrarDados();
    }
    
}
