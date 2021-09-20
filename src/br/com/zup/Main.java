package br.com.zup;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {

        Bola objeto = new Bola("68,5cm", "Roxa", "Nike", "65km/h");
        System.out.println("___Classe Bola___");
        System.out.println("Circunferência: " + objeto.circuferencia);
        System.out.println("Cor: " + objeto.cor);
        System.out.println("Marca: " + objeto.marca);
        System.out.println("Velocidade: " + objeto.velocidade);

        Bola objeto2 = new Bola("65,5 cm", "Preta com Branco", "Puma", "60km/h");
        System.out.println("___Classe Bola___");
        System.out.println("Circunferência: " + objeto2.circuferencia);
        System.out.println("Cor: " + objeto2.cor);
        System.out.println("Marca: " + objeto2.marca);
        System.out.println("Velocidade: " + objeto2.velocidade);

        Pessoa pessoa1 = new Pessoa("Maria João Silva Sauro", "38", "70", "1.70");
        System.out.println("___Classe Pessoa___");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade + " anos");
        System.out.println("Peso: " + pessoa1.peso + " kg");
        System.out.println("Altura: " + pessoa1.altura + " m");

        Pessoa pessoa2 = new Pessoa("Joana Maria", "46", "65", "1.56");
        System.out.println("___Classe Pessoa___");
        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade + " anos");
        System.out.println("Peso: " + pessoa2.peso + " kg");
        System.out.println("Altura: " + pessoa2.altura + " m");

        ContaCorrente conta1 = new ContaCorrente("001001", "MARA F G CUNHA", "3.900,00");
        System.out.println("___Classe Conta Corrente___");
        System.out.println("Numero da Conta: " +conta1.numeroConta);
        System.out.println("Nome do Correntista: "+conta1.nomeCorrentista);
        System.out.println("Saldo em conta: R$ "+conta1.saldo);
    }
}
