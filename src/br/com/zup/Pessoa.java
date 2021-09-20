package br.com.zup;
//2. Classe Pessoa: Crie uma classe que modele uma pessoa, toda pessoa contém nome, idade, peso e altura. No construtor, o peso é opcional, com valor default (padrão) zero e os demais atributos são obrigatórios.
public class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa (String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;

    }
}
