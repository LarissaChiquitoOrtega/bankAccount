package org.example.dominio;

public enum AccountType {

    CORRENTE("Corrente","01"),
    POUPANCA("Poupança","02"),
    SALARIO("Salário","03");

    private String label;
    private String code;

    private AccountType(String label, String code){
        this.label = label;
        this.code = code;
    }

    public static AccountType valueOfCode(String opcao){
        for(AccountType tipoConta: AccountType.values()) {
            if (tipoConta.getCode().equals(opcao)) {
                return tipoConta;
            }
        }
        return null;
    }

    public String getLabel() {
        return label;
    }

    public String getCode() {
        return code;
    }
}
