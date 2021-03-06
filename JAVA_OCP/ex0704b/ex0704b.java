package ex0704b;
import java.util.*;
import java.util.stream.*;
public class ex0704b {

public static void main(String[] args)
	{

List<Integer> list1 = Arrays.asList(new Integer[] {3, 2, 16, 7, 8, 25, 4});
List<Integer> list2 = Arrays.asList(1, 3, 5, 6, 9);  // simpler format

Stream<Integer> s1 = list1.stream();
Stream<Integer> s2 = list2.stream();
Stream<Integer> s12a = Stream.concat(s1, s2);
System.out.println("All elements after concat : ");
s12a.forEach(i -> System.out.print(i + " ")); // prints 3 2 16 7 8 25 4 1 3 5 6 9
System.out.println();
System.out.println();

System.out.println("All elements (i.e. all lists) : ");
Stream<List<Integer>> s12b = Stream.of(list1, list2);
s12b.forEach(i -> System.out.println(i + " "));
// prints two List objects
// [3, 2, 16, 7, 8, 25, 4]
// [1, 3, 5, 6, 9]
System.out.println();

System.out.println("All elements in elements (i.e. elements in all lists) : ");
Stream<List<Integer>> s12c = Stream.of(list1, list2);
s12c.flatMap(l -> l.stream()).forEach(i -> System.out.print(i + " "));
// prints 3 2 16 7 8 25 4 1 3 5 6 9
System.out.println();
System.out.println();

int[] a1 = {3, 2, 16, 7, 8, 25, 4};
int[] a2 = {1, 3, 5, 6, 9};
System.out.println("All int in elements (i.e. int in all arrays) : ");
Stream<int[]> s12d = Stream.of(a1, a2);
s12d.flatMapToInt(l -> Arrays.stream(l)).forEach(i -> System.out.print(i + " "));
// prints 3 2 16 7 8 25 4 1 3 5 6 9
System.out.println();
System.out.println();

System.out.println("All int in elements (i.e. int in all lists) : ");
Stream<List<Integer>> s12e = Stream.of(list1, list2);
s12e.flatMapToInt(l -> l.stream().mapToInt(i -> i))
        .forEach(i -> System.out.print(i + " "));
// prints 3 2 16 7 8 25 4 1 3 5 6 9
System.out.println();

	}
}
