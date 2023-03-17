package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b;

        System.out.println(" Digite o primeiro numero: ");
        a = scan.nextInt();
        System.out.println(" Digite o segundo numero: ");
        b = scan.nextInt();

        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("soma " + somar);
        System.out.println("subtr " + subtrair);
        System.out.println("multi " + multiplicar);
        System.out.println("div " + dividir);

    }
    public static double somar (double a, double b){
        return a + b;
    }public static double subtrair (double a, double b){
        return a - b;
    }public static double multiplicar (double a, double b){
        return a * b;
    }public static double dividir (double a, double b){
        return a / b;
    }

}
