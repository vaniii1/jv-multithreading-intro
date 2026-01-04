package core.basesyntax.thread;

public class MyThread extends Thread {
    private static ThreadLocal<Integer> num = new ThreadLocal<>();

    @Override
    public void run() {
        for (int i = 0; i < 21; i++) {
            num.set(i);
            System.out.printf("Thread name: %s, count: %d\n%n",
                    Thread.currentThread().getName(), num.get());
        }
    }
}
