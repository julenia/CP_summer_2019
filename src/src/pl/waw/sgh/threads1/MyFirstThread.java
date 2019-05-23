package src.src.pl.waw.sgh.threads1;

public class MyFirstThread extends Thread {

    private String name;
    private int iterator;
    private Thread prevThread;
    private AllThreads allThreads;

    public MyFirstThread(String name, AllThreads allThreads) {
        this.name = name;
        this.allThreads = allThreads;
    }

    public MyFirstThread(String name, AllThreads allThreads, Thread prevThread) {
        this.name = name;
        this.allThreads = allThreads;
        this.prevThread = prevThread;
    }


    @Override
    public void run() {
        try {
            if (prevThread != null) prevThread.join();
            while (iterator < 10) {

                iterator++;
                allThreads.increase(name);
                System.out.println(name + " it= " + iterator);
                this.sleep(800);

            }
        } catch (InterruptedException ie) {
            System.out.println("Interrupted " + name + " at: " + iterator);
        }
    }
}
