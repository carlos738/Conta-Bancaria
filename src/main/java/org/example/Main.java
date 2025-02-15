package org.example;

import org.example.Conta.ContaTerminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome da Agência: ");
        conta.setAgencia(scan.nextLine());

        System.out.println("Digite o número da Agência: ");
        conta.setNumeroDaAgencia(scan.nextInt());
        scan.nextLine();

        System.out.println("Digite o nome do cliente:");
        conta.setNomeDoCliente(scan.nextLine());

        System.out.println("Digite o número da conta: ");
        conta.setNumeroDaConta(String.valueOf(scan.nextInt()));
        scan.nextLine();

        System.out.println("Digite o valor de seu saldo: ");
        conta.setSaldo(Double.parseDouble(scan.next()));

        System.out.println("Olá " + conta.getNomeDoCliente() +", obrigado por criar sua conta em nosso banco," +
                "o nome da sua agência é " + conta.getAgencia() + ", o número de sua agência é "  + conta.getNumeroDaAgencia() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque! "                );

        scan.close();




    }

}
