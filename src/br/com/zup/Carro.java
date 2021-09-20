package br.com.zup;

/*4. Classe Carro: Crie uma classe para modelar um carro. Todo carro tem quantidade de portas, modelo, marca e potência. No construtor, a potência é opcional, com valor default (padrão) 2.0 e os demais atributos são obrigatórios. */

public class Carro {
    int qtdPortasCarro;
    String modelo;
    String marca;
    String potencia = 2.0;

    public Carro (int qtdPortasCarro, String modelo, String marca, String potencia) {
        this.qtdPortasCarro = qtdPortasCarro;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }
}
