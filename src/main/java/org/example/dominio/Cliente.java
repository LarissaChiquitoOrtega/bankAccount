package org.example.dominio;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private User user;
    private ArrayList<Account> account;

    public Cliente(String nome, User user, ArrayList<Account> account) {
        this.nome = nome;
        this.user = user;
        this.account = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Account> getAccount() {
        return account;
    }

    public void addConta(Account account){
        account.add(account);
    }
}
