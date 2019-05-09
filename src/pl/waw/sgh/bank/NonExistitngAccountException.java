package src.pl.waw.sgh.bank;

public class NonExistitngAccountException extends BankException{

    public NonExistitngAccountException(String msg) {
        super(msg);
    }
}
