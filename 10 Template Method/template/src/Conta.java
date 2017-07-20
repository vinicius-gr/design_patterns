/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius
 */
public abstract class Conta {
    final void abreConta (){
        if(pessoaFisica()){
            cadastrarPessoaFisica();
            validarPessoaFisicaSPC();
        }
        
        if(pessoaJuridica()){
            cadastrarPessoaJuridica();
            validarPessoaJuridicaReceitaFederal();            
        }
        
        depositarValorInicial();
        
        if(limite()){
            configurarLimite();
        }
        
        cadastrarSenha();
        
        if (cartaoDeCredito()){
            solicitarCartaoDeCredito();
        }
                
        finalizar();
    }

    private void depositarValorInicial() {
        System.out.println("Valor inicial depositado.");
    }

    private void cadastrarSenha() {
        System.out.println("Senha cadastrada.");
    }  

    private void finalizar() { 
        System.out.println("Finalizado.");
    }

    abstract void cadastrarPessoaFisica();
    abstract void validarPessoaFisicaSPC();
    abstract void cadastrarPessoaJuridica();
    abstract void validarPessoaJuridicaReceitaFederal();
    abstract void configurarLimite();
    abstract void solicitarCartaoDeCredito();
    
    boolean pessoaFisica(){return true;}
    boolean pessoaJuridica() {return false;}
    boolean limite() {return false;} 
    boolean cartaoDeCredito() {return false;}
    
}
