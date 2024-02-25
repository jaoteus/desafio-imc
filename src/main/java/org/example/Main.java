package org.example;

public class Main {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static double peso;
    public static double altura;
    public static double imc;

    public static void main(String[] args) {
        System.out.print("Digite seu peso: ");
        peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em centimetros): ");
        altura = scanner.nextDouble();
        altura = altura / 100;

        imc =  calcularImc(peso, altura);
        System.out.println("O seu IMC é: " + imc);
    }

    public static double calcularImc(double peso, double altura){
        return peso / (altura * altura);
    }
}