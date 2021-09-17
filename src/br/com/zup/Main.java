package br.com.zup;

public class Main {

    public static void main(String[] args) {
	/* 	1. Classe Bola: Crie uma classe que modele uma bola, toda bola contém uma circunferência, cor, marca e velocidade. Após a modelagem, instancie objetos diferentes no método main para testes. */

        Bola objeto = new Bola("68,5cm", "Roxa", "Nike", "65km/h");
        System.out.println(objeto.circuferencia);
        System.out.println(objeto.cor);
        System.out.println(objeto.marca);
        System.out.println(objeto.velocidade);

        Bola objeto2 = new Bola ("65,5 cm", "Preta com Branco", "Puma", "60km/h");
        System.out.println(objeto2.circuferencia);
        System.out.println(obj);
    }
}
