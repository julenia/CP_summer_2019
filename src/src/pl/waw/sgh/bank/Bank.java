package src.pl.waw.sgh.bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;

    private List<Customer> customerList = new ArrayList<Customer>();

    private List<Account> accountList = new ArrayList<Account>();

    private Integer lastCustID = 0;

    private Integer lastAccID = 1000;

    public Bank(String name) {
        this.name = name;
    }

    public Customer newCustomer(String firstName, String lastName, String email){
        Customer cust = new Customer(lastCustID++, firstName, lastName, email);
        customerList.add(cust);
        return cust;
    }

    private Account newAccount(Customer customer, String currency, boolean isChecking){
        Account acc = isChecking ?
                new CheckingAccount(lastAccID++, currency, customer)
                : new SavingAccount(lastAccID++, currency, customer);
        accountList.add(acc);
        return acc;
    }

    public Account newCheckingAccount(Customer customer, String currency){
        return newAccount(customer, currency, true);
    }

    public Account newSavingsAccount(Customer customer, String currency){
        return newAccount(customer, currency,  false);
    }

    public Account findAccountByID(Integer accID){

        for (Account acc : accountList){
            if (acc.getAccountID().equals(accID)){
                return acc;
            }
        }
        System.out.println("This account does not exist");
        return null;

    }

    public void transfer(Integer fromAccID, Integer toAccID, double toTransfer){
        transfer(findAccountByID(fromAccID), findAccountByID(toAccID), toTransfer);
    }

    public void transfer(Account fromAcc, Account toAcc, double toTransfer) {
        if (toTransfer < 0) System.out.println("Error: sum to transfer cannot be negative");
        else {
            for (Account acc : accountList) {
                if (acc.equals(fromAcc)) {
                    for (Account ac : accountList) {
                        if (ac.equals(toAcc)) {
                            fromAcc.charge(toTransfer);
                            toAcc.deposit(toTransfer);
                        }

                    }
                }
            }

        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "'" + name + '\'' +
                "\ncusts=" + customerList +
                "\naccs=" + accountList +
                '}';
    }
}
