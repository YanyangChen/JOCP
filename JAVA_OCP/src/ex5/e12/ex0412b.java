package ex5.e12;

import java.util.concurrent.*;

class Cali implements Runnable {
    char id = 'i';
    int number = 10000;
    CyclicBarrier barrier;
    Cali(CyclicBarrier barrier) {
        this.barrier = barrier;
    }
    public void run() {
        long sum=0;
        for (int i=1;i<number;i++) {
            sum = sum + i;
        }
        Result.i = sum;
        try {
            System.out.println("Waiting begins...");
            barrier.await();
            System.out.println("Waiting completed");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        } catch (BrokenBarrierException ex) {
            System.out.println(ex);
        }
        System.out.println("Calculation i adding result from Result.j is : " + (Result.j + sum));
    }
}

class Calj implements Runnable {
    char id = 'j';
    int number = 100;
    CyclicBarrier barrier;
    Calj(CyclicBarrier barrier) {
        this.barrier = barrier;
    }
    public void run() {
        long sum=0;
        for (int i=1;i<number;i++) {
            sum = sum + i;
        }
        Result.j = sum;
        try {
            System.out.println("Waiting begins...");
            barrier.await();
            System.out.println("Waiting completed");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        } catch (BrokenBarrierException ex) {
            System.out.println(ex);
        }
        System.out.println("Calculation j adding result from Result.i is : " + (Result.i + sum));
    }
}

class Result {
    static long i;
    static long j;
}
public class ex0412b {
	public static void main(String args[])
	{
		CyclicBarrier barrier = new CyclicBarrier(2);
		new Thread(new Cali(barrier)).start();
		new Thread(new Calj(barrier)).start();
		System.out.println("Threads created");
		System.out.println("Main Program ends");

		
	}

}
