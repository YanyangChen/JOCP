package ex0704e;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class ex0704e {
	public static void main(String[] args)
	{
		

List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd");

String reducedStr = list.stream().reduce("I:", (s1, s2) -> s1.concat(s2+" "));
System.out.println(reducedStr); // prints I:aaa bbb ccc ddd

String pReducedStr = list.parallelStream()
        .reduce("I:", (s1, s2) -> s1.concat(s2+" "));
System.out.println(pReducedStr); // prints I:aaa I:bbb  I:ccc I:ddd
System.out.println();

System.out.println("Working of reduce:");
String reducedStr2 = list.parallelStream()
        .reduce("Note : ", (s1, s2) -> {
            System.out.print("s1=\"" + s1 + "\"");
            System.out.print(" s2=\"" + s2 + "\"");
            String combined = s1.concat(s2);
            System.out.println(" => \"" + combined + "\"");
            return combined;
        });
System.out.println(reducedStr2);
System.out.println();

String pReducedStr3 = list.parallelStream()
        .reduce("I:", 
                (s1, s2) -> s1.concat(s2+" "), 
                (c1, c2) -> c1.concat(", " +c2));
System.out.println(pReducedStr3); // prints I:aaa I:bbb  I:ccc I:ddd
System.out.println();

for (int i=1;i<=3;i++) {
    System.out.print(i + " run : ");
    list.parallelStream().forEach(s -> System.out.print(s + " "));
    System.out.println();
}

String order1 = list.parallelStream().reduce("", (s1, s2) -> s1.concat(" "+s2));
System.out.println(order1);  // prints aaa  bbb  ccc  ddd

List<String> order2 = list.parallelStream().collect(Collectors.toList());
System.out.println(order2);  // [aaa, bbb, ccc, ddd]

list.parallelStream().forEachOrdered(s -> System.out.print(s + " "));
// printed aaa bbb ccc ddd

		
	}
}
