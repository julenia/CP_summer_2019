package src.pl.waw.sgh.bank;

import java.math.BigDecimal;

public abstract class Account {

    private Integer accountID;

    private BigDecimal balance = new BigDecimal(0);

    private String currency = "EUR";

    private Customer customer;

    public Account(Integer accountID,  String currency, Customer customer) {
        this.accountID = accountID;
        this.currency = currency;
        this.customer = customer;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void deposit(Double toDeposit){
        balance = balance.add(BigDecimal.valueOf(toDeposit));
    }

    public void charge(Double toCharge){
        balance = balance.subtract(BigDecimal.valueOf(toCharge));

    }

    @Override
    public String toString() {
        return "\n" + this.getClass().getSimpleName().replace("Account{", "")
                + "{" +
                "" + accountID +
                ", " + balance +
                " " + currency +
                ", custID=" + customer.getCustomerID() +
                '}';
    }
}
