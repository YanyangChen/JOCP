package ex4;

public class JavaApp2 extends Thread {
    public void run() {
        System.out.println("Running in "+currentThread().getName());
    }

    JavaApp2() {
    }

    JavaApp2(String s) {
        super(s);
    }

    public static void main(String[] args) {
        new JavaApp2("Red").start(); 
        Thread t = new JavaApp2();
        t.setName("Blue");
        t.start();
        currentThread().setName("JavaApp2");
        System.out.println("Running in "+currentThread().getName());
    }
}
