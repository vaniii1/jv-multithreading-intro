package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("Thread 1");
        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.setName("Thread Daemon");
        myRunnableThread.setDaemon(true);
        myThread.start();
        myRunnableThread.start();
    }
}
