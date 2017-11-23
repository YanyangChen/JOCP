/**
 * 
 */
/**
 * @author AC21611
 *
 */

package ex1;
class ex1 { 
   


//right on project explorer: ->run as ->java application
public static void main(String[] args)
{
//	Car mycar = new Car();
//	mycar.accelerate();
//	System.out.println(mycar.speed);
//	mycar.pressButton();
//	mycar.accelerate();
//	System.out.println(mycar.speed);
//	mycar.brake();
//	mycar.brake();        
//	System.out.println(mycar.speed);	
//	
//	
//	RacingCar myrcar = new RacingCar();
//	myrcar.pressButton();
////	myrcar.turboAccelerate();
//	System.out.println(myrcar.speed);
//	System.out.println(myrcar.spoiler);
//	
//	Person person = new Person();
//	person.name = "Peter";
//	person.birthYear = 1980;
//	person.address = "HongKong";
//	Car car1 = new Car();
//	car1.owner = person; //separate person class from class, instead, created an owner object inside Car
//	Car car2 = new Car();
//	car2.owner = person;
//	System.out.println(car1.owner.name);
//	System.out.println(car2.owner.name);        
//	person.address = "Kowloon";
//	System.out.println(car1.owner.address);        
//	System.out.println(car2.owner.address);  
	
	RacingCar racingcar1 = new RacingCar();
	racingcar1.switchEngineMode(2);
	racingcar1.accelerate();
	racingcar1.brake();
	System.out.println(racingcar1.speed);
	//hidden instance variable can be accessed in many ways
	//if a member instance variable in the superclass has private as access modifier, it is not inherited
	System.out.println(((Car) racingcar1).speed);
	
	RacingCar1 racingcar = new RacingCar1();
	racingcar.accelerate();
	racingcar.brake();
	System.out.println(racingcar.getSpeed());
	RacingCar1 racingcar01 = new RacingCar1();
	RacingCar2 racingcar02 = new RacingCar2();
	Car[] cars = { racingcar01, racingcar02 };
	for (Car c : cars) {
	    c.accelerate();
	    //c.speed read hidden superclass's variable
	    System.out.println(c.speed + " : " + c.getSpeed());
	}
	
	
	//static variable/method can be inherited. If they are overridden in subclass, 
    //they are hidden like instant variables
	Car c1 = new Car();
	Car c2 = new Car();
	RacingCar r1 = new RacingCar();
	RacingCar r2 = new RacingCar();
	RacingCar r3 = new RacingCar();        
	System.out.print(Car.counter1 + " : ");
	System.out.println(c1.counter1);
	System.out.print(Car.counter2 + " : ");
	System.out.println(c1.counter2);
	System.out.print(RacingCar.counter1 + " : ");
	System.out.println(r1.counter1);
	System.out.print(RacingCar.counter2 + " : ");
	System.out.println(r1.counter2);
	Car cr1 = r1;
	System.out.println(cr1.counter2);
	cr1.staticmethod2();
	
}}