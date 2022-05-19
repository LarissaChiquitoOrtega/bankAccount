package org.example.screen;

import org.example.domain.Account;
import org.example.domain.AccountType;
import org.example.domain.Client;
import org.example.factory.AccountFactory;

import java.util.Objects;
import java.util.Scanner;

public class CreateAccount {
    public void executar(Scanner s){

        Client client = CreateClient.execute(s);

        System.out.println("Informe a Agência:");
        String branch = s.next();
        System.out.println("Informe o tipo de Conta:");
        StringBuilder builder = new StringBuilder();
        for (AccountType accountType: AccountType.values()) {
            builder.append(String.format("%s - %s %n", accountType.getCode(), accountType.getLabel()));
        }
        System.out.println(builder);
        String op = s.next();
        AccountType accountType = AccountType.valueOfCode(op);
        if(Objects.isNull(accountType)){
            System.out.println("Não foi informado o tipo da conta");
        }else{
            //método static - por isso a classe Conta pode chamar, não precisando instanciar um objeto.
            Account account = AccountFactory.createAccount(client, accountType, branch);
            System.out.println("Cliente %s. %n \t Sua conta foi criada com sucesso " +
                    "%n \t Agência: %s %n \t Conta %s %n ", client.getName(), account.getNumeroConta());
        }

    }
}
