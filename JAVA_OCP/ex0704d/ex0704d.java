package ex0704d;
import java.util.*;
public class ex0704d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


List<String> list = Arrays.asList("Study ", "Java ", "Course ", "in ", "Systematic ");

System.out.println("Words containing 'a':");
list.stream().filter(s -> s.contains("a")).forEach(System.out::print);
// printed Java Systematic
System.out.println();
System.out.println();

System.out.print("Words after default sorting: ");
list.stream().sorted().forEach(System.out::print);
// printed Course Java Study Systematic in
System.out.println();

System.out.print("Words after default reverse sorting: ");
list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
// printed in Systematic Study Java Course
System.out.println();

System.out.print("Words after case insensitive sorting: ");
list.stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::print);
// printed Course in Java Study Systematic
System.out.println();

System.out.print("Words after sorting (excluding first letter): ");
list.stream().sorted(Comparator.comparing(s -> s.substring(1)))
        .forEach(System.out::print);
// printed Java in Course Study Systematic
System.out.println();

System.out.print("Words after sorting:");
Optional<String> max = list.stream().max(Comparator.naturalOrder());
System.out.println(max.get());  //prints in
System.out.println();

String reducedStr = list.stream().reduce("Note : ", (s1, s2) -> s1.concat(s2));
System.out.println(reducedStr); // prints Note : Study Java Course in Systematic 
System.out.println();

System.out.println("Working of reduce:");
String reducedStr2 = list.stream()
        .reduce("Note : ", (s1, s2) -> {
            System.out.print("s1=\"" + s1 + "\"");
            System.out.print(" s2=\"" + s2 + "\"");
            String combined = s1.concat(s2);
            System.out.println(" => \"" + combined + "\"");
            return combined;
        });
System.out.println(reducedStr2); // prints Note : Study Java Course in Systematic 
System.out.println();

Optional<String> reducedStr3 = list.stream().reduce((s1, s2) -> s1.concat(s2));
String string3 = reducedStr3.get();
System.out.println(string3); // prints Study Java Course in Systematic 

		
		
	}

}
