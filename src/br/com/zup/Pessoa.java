package br.com.zup;
//2. Classe Pessoa: Crie uma classe que modele uma pessoa, toda pessoa contém nome, idade, peso e altura. No construtor, o peso é opcional, com valor default (padrão) zero e os demais atributos são obrigatórios.
public class Pessoa {
    String nome;
    String idade;
    String peso;
    String altura;

    public Pessoa (String nome, String idade, String peso, String altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;

    }
}
