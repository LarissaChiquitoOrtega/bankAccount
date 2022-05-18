package org.example.telas;

import org.example.dominio.Account;
import org.example.dominio.AccountType;

import java.util.Objects;
import java.util.Scanner;

public class CriarConta {
    public void executar(Scanner s){
        System.out.println("Informe a Agência:");
        String agencia = s.next();
        System.out.println("Informe o tipo de Conta:");
        StringBuilder builder = new StringBuilder();
        for (AccountType tipoconta: AccountType.values()) {
            builder.append(String.format("%s - %s %n", tipoconta.getCode(), tipoconta.getLabel()));
        }
        String op = s.next();
        AccountType tipoConta = AccountType.valueOfCode(op);
        if(Objects.isNull(tipoConta)){
            System.out.println("Não foi informado o tipo da conta");
        }else{
            //método static - por isso a classe Conta pode chamar, não precisando instanciar um objeto.
            Account account = Account.criarConta(null, tipoConta, agencia);
        }

    }
}
