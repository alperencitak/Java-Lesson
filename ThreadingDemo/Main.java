package ThreadingDemo;

public class Main {

    public static void main(String[] args) {
        TimerThread th1 = new TimerThread("thread1");
        TimerThread th2 = new TimerThread("thread2");
        TimerThread th3 = new TimerThread("thread3");
        th1.start();
        th2.start();
        th3.start();
    }

}
