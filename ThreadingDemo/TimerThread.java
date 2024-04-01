package ThreadingDemo;

public class TimerThread implements Runnable {

    private Thread thread;
    private String tName;

    public TimerThread(String tName) {
        this.tName = tName;
        System.out.println("Creating: " + tName);
    }

    @Override
    public void run() {
        System.out.println("Working: " + tName);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(tName + " - " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Error -> " + ex);
        }

        System.out.println("Finished: " + tName);
    }
    
    public void start(){
        System.out.println("Thread object creating");
        if(thread==null){
            thread = new Thread(this,tName);
            thread.start();
        }
    }
}
