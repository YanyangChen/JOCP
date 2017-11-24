package ex4;

public class JavaApp1 extends Thread {
    public void run() {
        System.out.println("Running in " + this.getName());
    }

    public static void main(String[] args) {
        new JavaApp1().start(); 
        new JavaApp1().start(); 	
        
        System.out.println("Running in " + currentThread().getName());
    }
}