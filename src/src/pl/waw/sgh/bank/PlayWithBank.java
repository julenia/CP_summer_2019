package src.pl.waw.sgh.bank;

public class PlayWithBank {

    public static void main(String[] args) {
        try {
            Bank bank = new Bank("MyBank");
            Customer c1 = bank.newCustomer("John", "Smith", "john@smith.com");
            Customer c2 = bank.newCustomer("Anne", "Brown", "anne@brown.com");

            Account a1 = bank.newCheckingAccount(c1, "EUR");
            Account a2 = bank.newSavingsAccount(c1, "EUR");

            Account a3 = bank.newCheckingAccount(c2, "EUR");

            System.out.println(bank);

            a1.deposit(20.0);
            System.out.println(a1);

            a1.charge(5.0);
            System.out.println(a2);

            bank.transfer(1001, 1008, 400);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
        } catch (BankException be){
            System.err.println(be.getMessage());
        }




    }
}
