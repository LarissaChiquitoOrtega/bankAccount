package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bem-vindo ao banco Didi");

        int op = s.nextInt();
        do{
            System.out.println("O que deseja realizar?");
            System.out.println("01 - Criar uma nova conta \n");
            System.out.println("02 - Acessar minha conta \n");
            System.out.println("03 - Sair");
            op = s.nextInt();

            switch (op){
                case 1:
                    break;
                default:
                    System.out.println("Opção inválida, escolha novamente!");
            }
        }while (op != 3);
    }
}