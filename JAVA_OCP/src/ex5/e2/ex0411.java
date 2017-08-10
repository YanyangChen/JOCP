package ex5.e2;
import java.util.concurrent.*;
class SumTask extends RecursiveTask<Long> {
	   private final long[] array;
	   private final int low;
	   private final int high;
	   private static final int THRESHOLD = 6;

	   public SumTask(long[] array, int low, int high) {
	      this.array = array;
	      this.low = low;
	      this.high= high;
	   }

	   protected Long compute() {
	      if (high - low <= THRESHOLD) {
	          System.out.println("Calculating elements range "+low+" - "+(high-1));
	          long sum = 0;
	          for (int i = low; i < high; ++i){
	              sum += array[i];
	           }
	           return sum;
	       } else {
	           int mid = (low + high) / 2;
	           SumTask left = new SumTask(array, low, mid);
	           SumTask right = new SumTask(array, mid, high);
	           System.out.print("Split into "+low+"-"+(mid-1)+" & ");
	           System.out.println(mid+"-"+(high-1));
	           right.fork(); //what does fork mean?
	           return left.compute() + right.join();
	           //recursive begins in left part, than right part join the recursive
	      }
	   }
	}

public class ex0411 {
	public static void main(String args[]){
		//creating an array for summing 
		final int ARRAYSIZE = 32;
		long[] anArray = new long[ARRAYSIZE];
		int i = 0;
		while (i< ARRAYSIZE) {
		    anArray[i] = i;
		    i++;
		}

		//using fork-join to perform the calculation
		SumTask sumTask = new SumTask(anArray, 0, anArray.length);
		ForkJoinPool mainPool = new ForkJoinPool();
		Long sum = mainPool.invoke(sumTask);
		System.out.println("Final Result is " + sum);
	}

}
