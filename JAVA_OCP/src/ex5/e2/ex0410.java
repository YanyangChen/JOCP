package ex5.e2;

import java.util.concurrent.*;

class Cal implements Callable<Long> {
    char id;
    int number;
    Cal(char id, int number) {
        this.id = id;
        this.number = number;
    }
    public Long call() {
        long sum=0;
        for (int i=1;i<number;i++) {
            sum = sum + i;
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        return sum;
    }
}

class Cal2 implements Runnable {
    char id;
    int number;
    Cal2(char id, int number) {
        this.id = id;
        this.number = number;
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
    }
}

public class ex0410 {
	public static void main(String args[]){
	ExecutorService threadPool = Executors.newFixedThreadPool(4);
	Future<Long> f1 = threadPool.submit(new Cal('a', 100000000));
	Future<Long> f2 = threadPool.submit(new Cal('b', 100));
	System.out.println("1st Part Task submitted");
	try {
	    System.out.println("a result is : " + f1.get());  // wait 1st thread completes
	    System.out.println("b result is : " + f2.get());  // wait 2nd thread completes
	} catch (InterruptedException | ExecutionException ex) {
	    System.out.print(ex);
	}
	threadPool.shutdown();
	System.out.println("1st Part Ends");
	System.out.println();

	threadPool = Executors.newFixedThreadPool(4);
	//Future f = threadPool.submit(new Cal2('i', 100000000));
	threadPool.execute(new Cal2('i', 100000000));
	threadPool.execute(new Cal2('j', 100));
	//System.out.println(f.get());
	System.out.println("2nd Part Task submitted");
	//threadPool.shutdown();
	System.out.println("2nd Part Ends");
	//while (!threadPool.isTerminated()) {}
	System.out.println();

	//threadPool = Executors.newFixedThreadPool(4);
	threadPool.execute(new Cal2('x', 100000000));
	threadPool.execute(new Cal2('y', 100));
	System.out.println("3rd Part Task submitted");
	//threadPool.shutdownNow();
//	threadPool.execute(new Cal2('p', 100000000));
//	threadPool.execute(new Cal2('q', 100));
	
	System.out.println("3rd Part Ends");
}
	}
