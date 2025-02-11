package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Ok! Agora digite a sua agência:");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:" );
        int numeroConta = scanner.nextInt();

        System.out.println("E qual o saldo?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco! Sua agência é: " + numeroAgencia +
                ", sua conta é: " + numeroConta + ", e seu saldo de R$ " + saldo + " já está disponível para saque." );
    }
}