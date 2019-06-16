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
    public void deleteAccount(Account acc) {
        accountList.remove(acc);
    }
    public Customer findFirstCustomer() {
        if (customerList.size()>0)
            return customerList.get(0);
        else
            return null;
    }

    public Account findAccountByID(Integer accID) throws NonExistitngAccountException {

        for (Account acc : accountList){
            if (acc.getAccountID().equals(accID)){
                return acc;
            }
        }
        throw new NonExistitngAccountException("This account does not exist "+accID);


    }

    public void transfer(Integer fromAccID, Integer toAccID, double toTransfer) throws BankException {
        transfer(findAccountByID(fromAccID), findAccountByID(toAccID), toTransfer);
    }

    public void transfer(Account fromAcc, Account toAcc, double toTransfer) throws NotEnoughMoneyException, NonExistitngAccountException {
        for (Account acc : accountList) {
            if (acc.equals(fromAcc)) {
                fromAcc.charge(toTransfer);
            }
            else throw new NonExistitngAccountException("This account" + fromAcc + "does not exist ");
        }
        for (Account ac : accountList) {
            if (ac.equals(toAcc)) {
                toAcc.deposit(toTransfer);
            } else throw new NonExistitngAccountException("This account" + toAcc + "does not exist ");
        }
        }

    public Customer prevCustomer(Customer curCust){
        int curCustIdx = customerList.indexOf(curCust);
        if (curCustIdx>0){
            return customerList.get(curCustIdx-1);
        } else {
            return null;
        }
    }
    public Customer nextCustomer(Customer curCust){
        int curCustIdx = customerList.indexOf(curCust);
        if (curCustIdx< customerList.size()-1){
            return customerList.get(curCustIdx+1);
        } else {
            return null;
        }
    }

    public List<Account> findAccountByCustomer(Customer cust) {
        List<Account> acList = new ArrayList<>();
        for (Account acc : accountList) {
            if (acc.getCustomer()==cust)
                acList.add(acc);
        }
        return acList;
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
