package thread;

import java.util.ArrayList;

public class Letters implements Runnable {
    public static void main(String[] args) {
        Letters letters = new Letters("ABCD");
        for (Thread thread : letters.threads)
            System.out.println(thread.getName() + " starting");
        letters.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {
        }
        letters.stop();
        System.out.println("\nProgram completed.");
    }

    private String word;
    private ArrayList<Thread> threads;

    public Letters(String word) {
        this.word = word;
        this.threads = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            Thread thread = new Thread(this, String.valueOf(letter));
            threads.add(thread);
        }
    }

    public void start() {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public void run() {
        while (true) {
            System.out.print(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public void stop() {
        for (Thread thread : threads) {
            thread.interrupt();
        }
    }

    public ArrayList<Thread> getThreads() {
        return threads;
    }
}
