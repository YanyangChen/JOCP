package ex0702;

import java.util.*;
import java.util.stream.*;

public class ex0702 {
	
public static void main (String[] args)

{
	Integer[] i = {4, 2, 1, 3, 2};

	Stream stream11 = Arrays.stream(i);
	Stream stream12 = stream11.distinct();
	Object[] o12 = stream12.toArray();
	System.out.println(Arrays.toString(o12));   // prints [4, 2, 1, 3]
	System.out.println(Arrays.toString(i));   // prints [4, 2, 1, 3, 2]
	// Integer[] i11 = Arrays.copyOf(o12, o12.length, Integer[].class);
	// System.out.println(Arrays.toString(i11));   // prints [4, 2, 1, 3]
	// Stream<Integer> stream11a = Arrays.stream(i);
	// Stream<Integer> stream12a = stream11a.distinct();
	// Integer[] i11a = stream12a.toArray(Integer[]::new);
	// System.out.println(Arrays.toString(i11a));   // prints [4, 2, 1, 3]   
	System.out.println();
	      
	Stream<Integer> stream21 = Arrays.stream(i);
	Stream<Integer> stream22 = stream21.distinct();
	// Stream<Integer> stream23a = stream12.sorted();  // runtime IllegalStateException!
	Stream<Integer> stream23 = stream22.sorted();
	Integer[] i23 = stream23.toArray(Integer[]::new);
	System.out.println(Arrays.toString(i23));   // prints [1, 2, 3, 4]

	Integer[] i3 = Arrays.stream(i)
	                    .distinct()
	                    .sorted()
	                    .toArray(Integer[]::new);
	System.out.println(Arrays.toString(i3));   // prints [1, 2, 3, 4]
	System.out.println();

	Arrays.stream(i)
	        .distinct()
	        .sorted()
	        .filter(n -> n>2)
	        .map(n -> n*10)
	        .forEach(n -> System.out.print(n + "  "));  // prints 30  40
	System.out.println();
	System.out.println();

	long count = Arrays.stream(i)
	                    .distinct()
	                    .filter(n -> n>2)
	                    .count();
	System.out.println(count);   // prints 2

	List<Integer> list = Arrays.stream(i)
	                                .distinct()
	                                .sorted()
	                                .filter(n -> n>2)
	                                .collect(Collectors.toList());
	System.out.println(list);               // prints [3, 4]
	System.out.println(list.getClass());   // class java.util.ArrayList
	System.out.println();

	/**
	ArrayList<Integer> list2 = (ArrayList) Arrays.stream(i)
	                                            .distinct()
	                                            .sorted()
	                                            .filter(n -> n>2)
	                                            .collect(Collectors.toList());

	Set<Integer> set1 = Arrays.stream(i)
	                            .distinct()
	                            .sorted()
	                            .filter(n -> n>2)
	                            .collect(Collectors.toSet());
	System.out.println(set1.getClass());   // class java.util.HashSet

	TreeSet<Integer> set2 = Arrays.stream(i)
	                            .distinct()
	                            .sorted()
	                            .filter(n -> n>2)
	                            .collect(Collectors.toCollection(TreeSet::new));
	System.out.println(set2.getClass());   // class java.util.TreeSet
	System.out.println();
	**/

	int sum = Arrays.stream(i)
	                .distinct()
	                .reduce(0, (x,y) -> x + y);
	System.out.println(sum);   // prints 10 (from 1+2+3+4)
	
}

}
