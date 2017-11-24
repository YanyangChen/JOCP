package ex4;

public class JavaApp3 implements Runnable {
    public void run() {
        System.out.println("Running in "+Thread.currentThread().getName());
    }

    public void start(String s) {
        Thread objThread = new Thread(this, s);
        objThread.start();        
    }

    public static void main(String[] args) {
        new Thread(new JavaApp3(),"Red").start(); 
        new JavaApp3().start("Blue");
        Thread.currentThread().setName("JavaApp3");
        System.out.println("Running in "+Thread.currentThread().getName()); 
   }
}