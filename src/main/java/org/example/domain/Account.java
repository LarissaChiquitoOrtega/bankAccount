package org.example.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Account {
    private String accountNumber; //numero da conta é gerado
    private String branch; // agência bancária
    private AccountType accounttype;

    public Account(String numberAccount, String branch, AccountType accounttype) {
        this.accountNumber = numberAccount;
        this.branch = branch;
        this.accounttype = accounttype;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public AccountType getAccounttype() {
        return accounttype;
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


}
