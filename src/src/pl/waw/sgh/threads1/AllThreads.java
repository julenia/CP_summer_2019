package src.src.pl.waw.sgh.threads1;

public class AllThreads {

    static final int NUM_THREADS=5;

    private int allIterator =0;
    public synchronized void increase(String threadName){
        allIterator ++;
        System.out.println("Thread "+threadName+ " all it=" + allIterator);
    }



    public static void main(String[] args) {
        AllThreads allThreads = new AllThreads();

        MyFirstThread mft1 = new MyFirstThread("Thread 1", allThreads);
        //Thread t1 = new Thread(mft1);
        //mft1.run();
        MyFirstThread mft2 = new MyFirstThread("Thread 2", allThreads, mft1);
        //Thread t2 = new Thread(mft2);
        mft1.start();
        mft2.start();

        try {
            Thread.sleep(3000);
            //mft1.interrupt();
            //mft1.stop();
        } catch(InterruptedException i){

        }

        //mft2.run();

    }
}
