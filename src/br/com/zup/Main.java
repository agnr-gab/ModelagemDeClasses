package br.com.zup;

public class Main {

    public static void main(String[] args) {

        Bola objeto = new Bola("68,5cm", "Roxa", "Nike", "65km/h");
        System.out.println("Circunferência: " + objeto.circuferencia);
        System.out.println("Cor: " + objeto.cor);
        System.out.println("Marca: " + objeto.marca);
        System.out.println("Velocidade: " + objeto.velocidade);

        Bola objeto2 = new Bola("65,5 cm", "Preta com Branco", "Puma", "60km/h");
        System.out.println("Circunferência: " + objeto2.circuferencia);
        System.out.println("Cor: " + objeto2.cor);
        System.out.println("Marca: " + objeto2.marca);
        System.out.println("Velocidade: " + objeto2.velocidade);
    }
}
