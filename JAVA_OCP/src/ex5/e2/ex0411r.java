package ex5.e2;

import java.util.concurrent.*;

class Fibonacci extends RecursiveTask<Integer> {
	   final int n;
	   Fibonacci(int n) { this.n = n; }
	   public Integer compute() {
	     if (n <= 1)
	        return n;
	     Fibonacci f1 = new Fibonacci(n - 1);
	     f1.fork();
	     Fibonacci f2 = new Fibonacci(n - 2);
	     return f2.compute() + f1.join();
	   }
	 }

public class ex0411r {
	public static void main(String args[])
	{
	ForkJoinPool mainPool = new ForkJoinPool();
	Integer sum = mainPool.invoke(new Fibonacci(10));
	System.out.println("The Result is " + sum);
	}

}
