package ex5.e12;

import java.util.concurrent.*;

// configure these two lines just above main() method


public class ex0412remark {
	static long resulti;
	static long resultj;
	public static void main(String args[])
	{
		final CyclicBarrier barrier = new CyclicBarrier(2, new Runnable(){
		    public void run() {
		        System.out.println("Total sum is : " + (resulti + resultj));
		    }
		});
		new Thread(new Runnable() {
		    char id = 'i';
		    int number = 10000;
		    public void run() {
		        long sum=0;
		        for (int i=1;i<number;i++) {
		            sum = sum + i;
		        }
		        resulti = sum;
		        try {
		            System.out.println("Waiting begins...");
		            barrier.await();

		            System.out.println("Waiting completed");
		        } catch (InterruptedException ex) {
		            System.out.println(ex);
		        } catch (BrokenBarrierException ex) {
		            System.out.println(ex);
		        }
		    }
		}).start();
		new Thread(new Runnable() {
		    char id = 'j';
		    int number = 100;
		    public void run() {
		        long sum=0;
		        for (int i=1;i<number;i++) {
		            sum = sum + i;
		        }
		        resultj = sum;
		        try {
		            System.out.println("Waiting begins...");
		            barrier.await();

		            System.out.println("Waiting completed");
		        } catch (InterruptedException ex) {
		            System.out.println(ex);
		        } catch (BrokenBarrierException ex) {
		            System.out.println(ex);
		        }
		    }
		}).start();
		System.out.println("Threads created");
		System.out.println("Main Program ends");
		
	}

}
