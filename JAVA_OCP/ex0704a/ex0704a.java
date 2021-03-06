package ex0704a;
import java.util.*;

public class ex0704a {
	public static void main (String[] args)
	{

List<Integer> list = Arrays.asList(new Integer[] {3, 2, 16, 7, 8, 25, 4});     

System.out.print("Numbers that are divisible by 2 : ");
list.stream().filter(i -> (i % 2) == 0)
        .forEach(i -> System.out.print(i + " ")); // prints 2 16 8 4
System.out.println();  

System.out.println("Numbers that are divisible by 2 : ");
list.stream().filter(i -> (i % 2) == 0).forEach(System.out::println);
System.out.println();  


System.out.print("Count of numbers that is divisible by 2 : ");
long count = list.stream().filter(i -> (i % 2) == 0).count();
System.out.println(count);   // prints 4

System.out.print("Largest number that is divisible by 2 : ");
Optional<Integer> max = list.stream().filter(i -> (i % 2) == 0)
        .max(Integer::compare);
Integer maxInteger = max.get();
System.out.println(maxInteger);   // prints 16

System.out.print("Largest number that is divisible by 2 : ");
Optional<Integer> max2 = list.stream().filter(i -> (i % 2) == 0)
        .max(Comparator.comparing(i -> i));
Integer max2Integer = max2.get();
System.out.println(max2Integer);   // prints 16

System.out.print("Largest number that is divisible by 2 : ");
Optional<Integer> max3 = list.stream().filter(i -> (i % 2) == 0)
        .max((i, j) -> i.compareTo(j));
Integer max3Integer = max3.get();
System.out.println(max3Integer);   // prints 16

System.out.print("Smallest number that is divisible by 2 : ");
OptionalInt min = list.stream().filter(i -> (i % 2) == 0)
        .mapToInt(i -> i).min();
int minInt = min.getAsInt();
System.out.println(minInt);   // prints 2

System.out.print("First number that is divisible by 2 : ");
Optional<Integer> first = list.stream().filter(i -> (i % 2) == 0).findFirst();
System.out.println(first.get());   // prints 2

System.out.print("Any number that is divisible by 2 : ");
Optional<Integer> any = list.stream().filter(i -> (i % 2) == 0).findAny();
System.out.println(any.get());   // prints 2 (can be any other when there are other operations)

System.out.print("After filtering, all numbers can be divisible by 4: ");
boolean allBy4 = list.stream().filter(i -> (i % 2) == 0)
        .allMatch(i -> (i % 4) == 0);
System.out.println(allBy4);   // prints false

System.out.print("After filtering, one or more numbers can be divisible 4: ");
boolean anyBy4 = list.stream().filter(i -> (i % 2) == 0)
        .anyMatch(i -> (i % 4) == 0);
System.out.println(anyBy4);   // prints true

System.out.print("After filtering, no number can be divisible by 4: ");
boolean noneBy4 = list.stream().filter(i -> (i % 2) == 0)
        .noneMatch(i -> (i % 4) == 0);
System.out.println(noneBy4);   // prints false

	}
}
