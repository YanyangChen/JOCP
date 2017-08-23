package ex0701;

import java.util.*;
import java.util.stream.*;

public class ex0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		Stream streamA = lista.stream();
		System.out.println(streamA.getClass());  // class java.util.stream.ReferencePipeline$Head

		Integer[] b = {1, 2, 3};
		Stream streamB = Arrays.stream(b);
		System.out.println(streamB.getClass());  // class java.util.stream.ReferencePipeline$Head

		String[] c = {"a", "b", "c", "d"};
		Stream streamC = Stream.of(c);
		System.out.println(streamC.getClass()); //class java.util.stream.ReferencePipeline$Head

		int[] d = {1, 2, 3};
		IntStream streamD = Arrays.stream(d);
		System.out.println(streamD.getClass()); //class java.util.stream.IntPipeline$Head

		IntStream streamE = IntStream.range(0,10); // elements 0 - 9
		System.out.println(streamE.getClass()); //class java.util.stream.ReferencePipeline$Head

	}

}
