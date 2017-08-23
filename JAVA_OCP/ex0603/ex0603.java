package ex0603;
import java.util.*;


class Car {
    private String licenseNo;
    private int speed;
    Car (String s) {
        licenseNo = s;
    }
    void accelerate() {
        speed = speed + 10;
    }
    public String toString() {
        return licenseNo;
    }
    int getSpeed() {
        return speed;
    }
    static void forceStop(Car obj) {
        obj.speed = 0;
    }
}

class RacingCar extends Car {
    RacingCar(String s) {
        super(s);
    }
    void accelerate() {
        super.accelerate();
        super.accelerate();
    }
}


public class ex0603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Car("C1111"));
		list.add(new RacingCar("R2222"));
		list.add(new Car("C3333"));
		list.forEach(c -> c.accelerate());
		list.forEach(c -> System.out.println(c + " : " + c.getSpeed()));
		//list.forEach(c -> { c.accelerate(); System.out.println(c + " : " + c.getSpeed()); } );
		System.out.println();

		list.removeIf(c -> c.getClass().getSimpleName().equals("RacingCar"));
		list.forEach(System.out::println);
		System.out.println();

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.replaceAll(i -> i + 10);
		System.out.println(list2);

	}

}
