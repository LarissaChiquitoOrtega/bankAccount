package org.example.screen;

import org.example.domain.Client;
import org.example.domain.User;

import java.util.Scanner;
/*Classe ainda é do pacote telas, porque interage com o usuário, se não, poderia pertencer ao factory,
sendo ela estática.
 */
public class CreateClient {

    public static Client execute(Scanner s){

        System.out.println("Criando um cliente ");
        System.out.println("Informe seu nome: ");
        String name = s.next();
        System.out.println("Informe seu login de acesso: ");
        String login = s.next();
        System.out.println("Informe a senha de acesso: ");
        String password = s.next();
        System.out.println("Informe a senha novamente: ");
        String passwordConfirmation = s.next();
        if (password.equals(passwordConfirmation)) {
            return new Client (new User(login,password), name);
        }



    }
}
