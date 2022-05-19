package org.example.domain;

import java.util.ArrayList;

public class Client {

    private String name;
    private User user;
    private ArrayList<Account> account;

    public Client(String name, User user, ArrayList<Account> account) {
        this.name = name;
        this.user = user;
        this.account = new ArrayList<>();
    }

    public String getName() {
        return name;
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
