package ex0703;
import java.util.*;
import java.util.stream.*;
public class ex0703 {
	
	public static void main (String[] args)
	{
		
		Integer[] i = {4, 2, 1, 3, 2};
	      
		Stream<Integer> stream11 = Arrays.stream(i);
		Stream<Integer> stream12 = stream11.filter(n->{System.out.println(n); return n>=2;});
		Stream<Integer> stream13 = stream12.sorted();
		Stream<Integer> stream14 = stream13.map(n->{System.out.println("  "+n); return n;});
		System.out.println("**** Before toArray() ****");
		Integer[] i14 = stream14.toArray(Integer[]::new);
		System.out.println("**** After toArray() ****");
		System.out.println(Arrays.toString(i14));   // prints [2, 2, 3, 4]
		System.out.println();

		Integer[] i2 = Arrays.stream(i)
		                    .peek(n -> System.out.println(n))
		                    .filter(n -> n>=2)
		                    .sorted()
		                    .peek(n -> System.out.println("  "+n))
		                    .map(n -> n)
		                    .toArray(Integer[]::new);
		System.out.println(Arrays.toString(i2));   // prints [2, 2, 3, 4]
		System.out.println();

		Integer[] i3 = Arrays.stream(i)
		                    .peek(n -> System.out.println(n))
		                    .skip(1)
		                    .peek(n -> System.out.println("  "+n))
		                    .limit(3)
		                    .peek(n -> System.out.println("    "+n))
		                    .toArray(Integer[]::new);
		System.out.println(Arrays.toString(i3));   // prints [2, 1, 3]
		System.out.println();
		System.out.println();

		Integer[] i4 = Arrays.stream(i)
		                    .parallel()
		                    .peek(n -> System.out.println(n + " " +
		                            Thread.currentThread().getName()))
		                    .skip(1)
		                    .peek(n -> System.out.println("  " + n + " " +
		                            Thread.currentThread().getName()))
		                    .limit(3)
		                    .peek(n -> System.out.println("    " + n + " " +
		                            Thread.currentThread().getName()))
		                    .toArray(Integer[]::new);
		System.out.println(Arrays.toString(i4));   // prints [2, 1, 3]
		System.out.println();


		
	}

}
