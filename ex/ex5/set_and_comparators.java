package ex5;
import java.util.*;

public class set_and_comparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Car1> ts1 = new TreeSet<>();
		Car1 car1a = new Car1("BB2345");
		Car1 car1b = new Car1("AA1234");
		ts1.add(car1a);
		ts1.add(car1b);
		System.out.println("ts1 : " + ts1);

		Comparator<Car2> c2 = new Comparator<Car2>() {
		    public int compare(Car2 i, Car2 j) {
		        return i.toString().compareTo(j.toString());
		    }
		};
		TreeSet<Car2> ts2 = new TreeSet<>(c2);
		Car2 car2a = new Car2("DD4567");
		Car2 car2b = new Car2("CC3456");
		ts2.add(car2a);
		ts2.add(car2b);
		System.out.println("ts2 : " + ts2);

		System.out.println("\n*****************\n");

		TreeSet<Car3> ts3 = new TreeSet<>();
		Car3 car3a = new Car3("S20");
		Car3 car3b = new Car3("S00");
		Car3 car3c = new Car3("S10");
		ts3.add(car3a);
		ts3.add(car3b);
		ts3.add(car3c);
		System.out.println("ts3 : " + ts3);    // prints [s20]

		car3a.accelerate();
		car3a.accelerate();
		car3c.accelerate();
		// all have different speed now
		ts3.add(car3b);
		ts3.add(car3c);
		System.out.print("ts3 with different speed : ");
		System.out.println(ts3);    // prints [S00, S10, S20]

		car3b.accelerate();
		car3b.accelerate();
		car3c.accelerate();
		// all have same speed 30 now
		System.out.print("ts3 with subsequnet speed change : ");
		System.out.println(ts3);    // prints [S00, S10, S20]

		System.out.println("ts3 first() : " + ts3.first()); // prints S00
		System.out.println("ts3 last() : " + ts3.last());   // prints S20
		ts3.remove(ts3.first());
		System.out.print("ts3 with first() removed : ");
		System.out.println(ts3);    // prints [S00, S20]

	}

}
