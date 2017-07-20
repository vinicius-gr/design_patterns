/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius
 */
public class Juridica extends Conta{
    
    @Override
    boolean pessoaJuridica() {return true;}
    @Override
    boolean pessoaFisica() {return false;}
    @Override
    boolean limite() {return true;} 
    @Override
    boolean cartaoDeCredito() {return true;}
    
    @Override
    void cadastrarPessoaFisica() {}

    @Override
    void validarPessoaFisicaSPC() {}

    @Override
    void cadastrarPessoaJuridica() {
        System.out.println("Pessoa juridica cadastrada.");
    }

    @Override
    void validarPessoaJuridicaReceitaFederal() {
        System.out.println("Pessoa juridica validada.");
    }

    @Override
    void configurarLimite() {
        System.out.println("Limite configurado.");
    }

    @Override
    void solicitarCartaoDeCredito() {
        System.out.println("Cartão solicitado.");
    }
}
