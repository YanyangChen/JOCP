package ex5.e12;
import java.util.concurrent.*;


class Cal implements Runnable {
    char id;
    int number;
    CountDownLatch latch;
    Cal(char id, int number, CountDownLatch latch) {
        this.id = id;
        this.number = number;
        this.latch = latch;
    }
    public void run() {
        long sum=0;
        for (int i=1;i<number;i++) {
            sum = sum + i;
        }
        try {
            Thread.sleep(5000);
            System.out.println(id + " result is : " + sum);
        } catch (InterruptedException e) {}
        latch.countDown();
    }
}
public class ex0412a {
	public static void main(String args[])
	{
		CountDownLatch latch = new CountDownLatch(2);        
		new Thread(new Cal('i', 100000000, latch)).start();
		new Thread(new Cal('j', 100, latch)).start();
		System.out.println("Threads created");
		try {
		    System.out.println("Waiting begins...");
		    latch.await();
		    System.out.println("Waiting completed");
		} catch (InterruptedException ex) {
		    System.out.println(ex);
		}
		System.out.println("Program ends");
		System.out.println();
	}

}
