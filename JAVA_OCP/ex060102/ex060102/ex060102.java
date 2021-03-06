package ex060102;
import java.util.*;

interface Calculator {
    int cal(int x, int y);
}

class Car {
    String licenseNo;
    Car (String s) {
        licenseNo = s;
    }
    public String toString() {
        return licenseNo;
    }
}

public class ex060102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator() {
	        public int cal(int x, int y) {
	            return x + y;
	        }
	    };
	System.out.println(c1.cal(1,2));

	Calculator c2 = (a, b) -> a + b;
	System.out.println(c2.cal(1,2));

	Runnable r = () -> System.out.println(Thread.currentThread().getName());
	new Thread(r).start();

	java.util.List<Car> list = new java.util.ArrayList<>();
	list.add(new Car("2222"));
	list.add(new Car("1111"));
	System.out.println("Before sort : " + list);
	java.util.Comparator<Car> com = (a, b) -> a.licenseNo.compareTo(b.licenseNo);
	java.util.Collections.sort(list,com);
	System.out.println("After sort : " + list);


	new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
	java.util.Collections.sort(list,(a, b) -> b.licenseNo.compareTo(a.licenseNo));
	// Note that the above a and b object position is reverse when calling compareTo()
	System.out.println("After reverse sort : " + list);
	}

}
