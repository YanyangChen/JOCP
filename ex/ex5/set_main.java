package ex5;
import java.util.*;

public class set_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(true);
		hs.add(123);
		hs.add(123);                           // duplicate item
		hs.add("apple");
		hs.add("orange");
		hs.add(new Car());
		System.out.println(hs.size());        // 5
		hs.remove(123);
		System.out.println(hs.size());        // 4
		for(Object item : hs) {
		    System.out.println(item.getClass() + " : " + item); // prints each item
		}
		System.out.println(hs.contains("apple"));                // true
		hs.clear();
		System.out.println(hs.size());        // 0
		System.out.println(hs.isEmpty());     // true

		System.out.println("\n***************\n");

		HashSet<Car> hsCar = new HashSet<>();
		//hsCar.add("apple");          // Compilation Error
		hsCar.add(new Car());
		for(Car c : hsCar) {
		    System.out.println(c);    // prints each item
		}

		System.out.println("\n***************\n");

		HashSet<String> hsStr = new HashSet<>();
		hsStr.add("apple");
		hsStr.add("orange");
		Iterator<String> it = hsStr.iterator();
		while (it.hasNext()) {		         // if there is next item
		    System.out.println(it.next());       // get that next item
		}

		System.out.println("\n***************\n");

		// HashSet<int> hsi = new HashSet<int>();     // compilation error
		HashSet<Integer> hsI = new HashSet<Integer>();
		hsI.add(3);
		Iterator<Integer> itI = hsI.iterator();
		int j = itI.next() + 1;
		hsI.add(j);
		System.out.println(hsI);

		System.out.println("\n***************\n");

		Collection<Car> colCar = new HashSet<>();
		//colCar.add("apple");          // Compilation Error
		colCar.add(new Car());
		for(Car c : colCar) {
		    System.out.println(c);     // prints each item
		}

		System.out.println("\n***************\n");

		Set<Car> s = Collections.synchronizedSet(new HashSet<Car>());
		s.add(new Car());
		for(Car c : s) {
		    System.out.println(c); // prints each item
		}


	}

}
