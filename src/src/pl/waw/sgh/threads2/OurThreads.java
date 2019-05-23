package src.src.pl.waw.sgh.threads2;

public class OurThreads {

    public static void main(String[] args) {
        Message msg = new Message("My message 1");
        Waiter w1 = new Waiter(msg);
        Thread t1 = new Thread(w1);
        t1.start();
        Waiter w2 = new Waiter(msg);
        Thread t2 = new Thread(w2);
        t2.start();
        Notifier n1 = new Notifier(msg);
        Thread nt1 = new Thread(n1);
        nt1.start();
    }
}
