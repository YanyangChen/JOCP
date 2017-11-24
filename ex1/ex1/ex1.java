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
	
	Bus bus = new Bus();
	bus.accelerate();
	System.out.println(bus.getMilePerHour());
	System.out.println(bus.getPreciseMilePerHour());
	Van van = new Van();
	van.accelerate();
	System.out.println(van.getMilePerHour());
	System.out.println(van.getPreciseMilePerHour());
	
	
	Person peter1 = new Person();
	Person mary = new Person();
	Car car1 = new Car();
	peter1.payTax(1000);
	mary.payTax(2000);
	car1.extendLicense(3000);
	GovernmentFinder.getInstance().getGovernment().treasuryReport();
	
	NoteBook111 nb1 = new NoteBook111();
	NoteBook111.Battery b1 = new NoteBook111.Battery();
	NoteBook111.Battery b2 = new NoteBook111.Battery();
	nb1.getSytemStatus();
	b1.charging(4);
	nb1.replaceBattery(b1);
	nb1.getSytemStatus();
	nb1.replaceBattery(b2);
	nb1.getSytemStatus();
	NoteBook111.Battery.getCounters();
	
	
	Person peter = new Person("Peter");
	peter.showPassports();
	Person.Passport passport1 = peter.new Passport("HKSAR", "A12345");
	peter.collectPassport(passport1);
	peter.showPassports();
	Person.Passport passport2 = peter.new Passport("BNO", "D45678");
	peter.collectPassport(passport2);
	peter.showPassports();
	System.out.println(peter == passport1.getPerson());
	System.out.println(passport1.showPopulation());
	
	
	Person peter2 = new Person("Peter2");
	peter2.showPassports();
	Person.Passport passport11 = peter2.new Passport("HKSAR", "A12345");
	peter2.collectPassport(passport1);
	peter2.showPassports();
	Person.Passport passport21 = peter2.new Passport("BNO", "D45678");
	peter2.collectPassport(passport2);
	peter2.showPassports();
	System.out.println(peter2 == passport1.getPerson());
	System.out.println(passport1.showPopulation());
	System.out.println();
	Person john = new Person("john");
	john.applyAndCollectPassport("HKSAR", "A123456");
	john.showPassports();
	System.out.println(Person.totPassportCreated);
	System.out.println(peter2.personPassportCreated);
	
	CarTest t = new CarTest("Test20160101");
	t.doTest();
	CarTest.doTest2();
	
	CarTest t2 = new CarTest("Test20170101");
	t2.doTest1();
	CarTest.doTest2(15);
	
	
	Staff peter3 = new Staff("Peter",Day.MONDAY);
	System.out.println(peter3.name + " is off on " + peter3.getholiday());
	System.out.println();
	System.out.println("Earth mass : " + Planet.EARTH.getMass());
	final int myWeight = 70;
	double mass = myWeight/Planet.EARTH.surfaceGravity();
	for (Planet p : Planet.values()) {
	    System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
	}
}}