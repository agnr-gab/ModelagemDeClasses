package br.com.zup;

// 3. Classe Conta Corrente: Crie uma classe para construir uma conta corrente. A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. No construtor, o saldo é opcional, com valor default (padrão) zero e os demais atributos são obrigatórios.
public class ContaCorrente {
    String numeroConta;
    String nomeCorrentista;
    double saldo = 0;

    public ContaCorrente(String numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;

    }
}
