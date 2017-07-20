/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius
 */
public class Poupança extends Conta{

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
    void configurarLimite() {}

    @Override
    void solicitarCartaoDeCredito() {}
    
}
