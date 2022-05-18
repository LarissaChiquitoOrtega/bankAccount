package org.example.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Account {
    private String accountNumber; //numero da conta é gerado
    private String agency;
    private AccountType accounttype;

    public Account(String numberAccount, String agency, AccountType accounttype) {
        this.accountNumber = numberAccount;
        this.agency = agency;
        this.accounttype = accounttype;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public AccountType getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(AccountType accounttype) {
        this.accounttype = accounttype;
    }


    //depositar
    public BigDecimal deposit(BigDecimal valor){
        return BigDecimal.ZERO;
    }
    //sacar
    public BigDecimal withdraw(BigDecimal valor){
        return BigDecimal.ZERO;
    }
    //tranferir
    public BigDecimal transferir(BigDecimal valor){
        return BigDecimal.ZERO;
    }
    //saldo
    public BigDecimal saldo(BigDecimal valor){
        return BigDecimal.ZERO;
    }
    //extrato
    public ArrayList<BigDecimal> extrato(LocalDate dateStart, LocalDate dateEnd){
        return (ArrayList<BigDecimal>) Arrays.asList(BigDecimal.ZERO);
    }
//único método estático,
// por isso a minha variável da classe criar conta consegue acessá-lo sem que a classe Conta seja instanciada
//contexto estático, quer dizer que eu posso fazer uso sem instanciar um objeto, não preciso criar um objeto.
    public static Account criarConta(Cliente cliente, AccountType accounttype, String agency){
        String accountNumber = String.format("%04d", new Random().nextInt());
        Account account = new Account(accountNumber, agency, accounttype);
        cliente.addConta(account);
        return account;
    }

}
