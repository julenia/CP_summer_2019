package src.pl.waw.sgh.bank;

public class NotEnoughMoneyException extends BankException{

    public NotEnoughMoneyException(String msg) {
        super(msg);
    }
}
