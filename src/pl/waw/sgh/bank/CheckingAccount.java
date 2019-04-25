package src.pl.waw.sgh.bank;

import java.math.BigDecimal;

public class CheckingAccount extends Account {

    public CheckingAccount(Integer accountID, String currency, Customer customer) {
        super(accountID, currency, customer);
    }
}
