/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius
 */
public class Corrente extends Conta{
    
    @Override
    boolean limite() {return true;} 
    @Override
    boolean cartaoDeCredito() {return true;}
    
    @Override
    void cadastrarPessoaFisica() {
        System.out.println("Pessoa fisica cadastrada.");
    }

    @Override
    void validarPessoaFisicaSPC() {
        System.out.println("Pessoa fisica validada.");
    }

    @Override
    void cadastrarPessoaJuridica() {}

    @Override
    void validarPessoaJuridicaReceitaFederal() {}

    @Override
    void configurarLimite() {
        System.out.println("Limite configurado.");
    }

    @Override
    void solicitarCartaoDeCredito() {
        System.out.println("Cartão solicitado.");
    }
    
}
