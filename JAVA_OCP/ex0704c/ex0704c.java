package ex0704c;
import java.util.*;
import java.util.stream.*;
public class ex0704c {
	public static void main(String[] args)
	{
		int[] array = {3, 2, 16, 7, 8, 25, 4};

		IntStream s1 = Arrays.stream(array);
		OptionalDouble oAvg = s1.average();
		System.out.println("Average of all int values is : " + oAvg.getAsDouble());
		// prints 9.285714285714286

		IntStream s2 = Arrays.stream(array);
		Stream<Integer> s3 = s2.boxed();
		System.out.println("Integer objects of the values are : ");
		s3.forEach(System.out::println);
		// prints {3, 2, 16, 7, 8, 25, 4} each on its own line


	}

}
