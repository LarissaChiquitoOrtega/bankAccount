package org.example.factory;

import org.example.domain.Account;
import org.example.domain.AccountType;
import org.example.domain.Client;

import java.util.Random;

public class AccountFactory {
    //único método estático,
// por isso a minha variável da classe criar conta consegue acessá-lo sem que a classe Conta seja instanciada
//contexto estático, quer dizer que eu posso fazer uso sem instanciar um objeto, não preciso criar um objeto.
    public static Account createAccount(Client client, AccountType accounttype, String branch){
        String accountNumber = String.format("%04d", new Random().nextInt());

        Account account = new Account(accountNumber, branch, accounttype);

        client.addConta(account);
        return account;
    }

}
