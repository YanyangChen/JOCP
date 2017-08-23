package ex0602;
import java.util.function.*;

class Car {
    private int speed;
    void accelerate() {
        speed = speed + 10;
    }
    int getSpeed() {
        return speed;
    }
    static void forceStop(Car obj) {
        obj.speed = 0;
    }
}


public class ex0602 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSupplier f1 = () -> 3;
		Runnable f2 = () -> System.out.println("hello");
		IntUnaryOperator f3 = i -> i + 1;
		IntPredicate f4 = i -> i > 3;
		IntConsumer f5 = i -> System.out.println(i);
		IntBinaryOperator f6 = (i,j) -> i + j;

		Supplier<Car> f7 = () -> new Car();
		ToIntFunction<Car> f8 = c -> c.getSpeed();
		Predicate<Car> f9 = c -> c.getSpeed() > 60; 
		Consumer<Car> f10 = c -> c.accelerate(); 

		Supplier<Car> f11 = Car::new;         // calling Car's constructor
		Car car = new Car();
		Runnable f12 = car::accelerate;      // call car object accelerate();
		IntSupplier f13 = car::getSpeed;      // calling car object getSpeed()
		Consumer<Car> f14 = Car::forceStop;  // call CAr's forceStop(Car obj);

		f12.run();                            
		System.out.println(f13.getAsInt());  // prints 10
		f14.accept(car);
		System.out.println(f13.getAsInt());  // prints 0

	}

}
