package br.com.zup;
///* 	1. Classe Bola: Crie uma classe que modele uma bola, toda bola contém uma circunferência, cor, marca e velocidade. Após a modelagem, instancie objetos diferentes no método main para testes. */
public class Bola {
    String circuferencia;
    String cor;
    String marca;
    String velocidade;

    public Bola(String circuferencia, String cor, String marca, String velocidade) {
        this.circuferencia = circuferencia;
        this.cor = cor;
        this.marca = marca;
        this.velocidade = velocidade;
    }
}
