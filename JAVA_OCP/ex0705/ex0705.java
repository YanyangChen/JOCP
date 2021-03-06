package ex0705;
import java.util.*;
import java.nio.file.*;
import java.util.stream.*;
import java.io.*;
public class ex0705 {
	public static void main (String[] args)
	{
		try {
		    List<String> list = Files.readAllLines(Paths.get("c:\\javaex\\file1.txt"));
		    System.out.print("Total Number of lines in file : ");
		    System.out.println(list.stream().count());
		    System.out.println("\nLines that contain the word \"Sentence\" : ");
		    list.stream().filter(s -> s.contains("sentence"))
		            .forEach(System.out::println);
		    Path target = Paths.get("c:\\javaex\\write.txt");
		    Files.deleteIfExists(target);
		    Files.createFile(target);
		    list.stream().forEach(s -> {
		        try {
		            s = s + System.getProperty("line.separator");
		            Files.write(target, 
		                        s.getBytes(),
		                        StandardOpenOption.APPEND);
		        } catch (IOException ex) { System.out.println(ex); }
		    });
		} catch (IOException ex) { System.out.println(ex); }
		System.out.println("\n************\n");

		try {
		    Stream<String> st = Files.lines(Paths.get("c:\\javaex\\file1.txt"));
		    System.out.println("Lines that contain the word \"Sentence\" : ");
		    st.filter(s -> s.contains("sentence")).forEach(System.out::println);
		} catch (IOException ex) { System.out.println(ex); }
		System.out.println("\n************\n");

		/* using try-with-resources
		try (Stream<String> st = Files.lines(Paths.get("c:\\javaex\\file1.txt"))) {
		    System.out.println("Lines that contain the word \"Sentence\" : ");
		    st.filter(s -> s.contains("sentence")).forEach(System.out::println);
		} catch (IOException ex) { System.out.println(ex); }
		System.out.println("\n************\n");
		*/

		System.out.println("list for directory \"src\" : ");
		try {
		    Stream<Path> st = Files.list(Paths.get("c:\\javaex\\src"));
		    st.forEach(System.out::println);
		} catch (IOException ex) { System.out.println(ex); }
		System.out.println();

		System.out.println("walk for directory \"src\" : ");
		try {
		    Stream<Path> st = Files.walk(Paths.get("c:\\javaex\\src"));
		    st.forEach(System.out::println);
		} catch (IOException ex) { System.out.println(ex); }
		System.out.println();

		System.out.println("find for directory \"javaex\" : ");
		try {
		    Stream<Path> st = Files.find(Paths.get("c:\\javaex"), 
		                                 2, 
		                                 (path, attr) -> 
		                                         path.getFileName().toString().contains("1"));
		    st.forEach(System.out::println);
		} catch (IOException ex) { System.out.println(ex); }
		System.out.println();

		/* walk() + filter()
		System.out.println("find for directory \"javaex\" : ");
		try {
		    Stream<Path> st = Files.walk(Paths.get("c:\\javaex"), 2);
		    st.filter(p -> 
		        p.getFileName().toString().contains("1")).forEach(System.out::println);
		} catch (IOException ex) { System.out.println(ex); }
		System.out.println();
		*/

		/*  AccessDeniedException
		System.out.println("find for home directory : ");
		try {
		    String homedir = System.getProperty("user.home");
		    Stream<Path> st = Files.find(Paths.get(homedir), 
		                                 2, 
		                                (path, attr) -> true);
		    st.forEach(System.out::println);
		} catch (IOException ex) { System.out.println(ex); }
		System.out.println();
		*/

	}
}
