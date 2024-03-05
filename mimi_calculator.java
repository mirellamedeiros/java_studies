package org.example;

import java.util.Scanner;

public class MinhaCalculadora {
    public static double somar(double a, double b) {
        return a + b;
    }
    public static double subtrair(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Divisão por zero (ou < 0) é uma opção inválida :(");
            return Double.NaN;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------\n" + "Calculadora da Mimi\n" + "----------");
        System.out.println("Por favor escolha uma das seguintes operações: \n" + "1. Adição: +\n" + "2. Subtração: -\n" + "3. Multiplicação: *\n" + "4. Divisão: /\n" + ":) ");
        int opcao = scanner.nextInt();
        System.out.print("Insira o primero valor: ");
        double n1 = scanner.nextDouble();
        System.out.print("Agora insira o segundo valor: ");
        double n2 = scanner.nextDouble();
        double resultado = 0;
        switch (opcao) {
            case 1:
                resultado = somar(n1, n2);
                break;
            case 2:
                resultado = subtrair(n1, n2);
                break;
            case 3:
                resultado = multiplicar(n1, n2);
                break;
            case 4:
                resultado = dividir(n1, n2);
                break;
            default:
                System.out.println("Operação inválida :(");
                return;
        }
        System.out.println("Seu resultado é: " + resultado +"\n:)");
        scanner.close();
    }
}
