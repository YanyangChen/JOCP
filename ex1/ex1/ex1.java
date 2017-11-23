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
	Car mycar = new Car();
	mycar.accelerate();
	System.out.println(mycar.speed);
	mycar.pressButton();
	mycar.accelerate();
	System.out.println(mycar.speed);
	mycar.brake();
	mycar.brake();        
	System.out.println(mycar.speed);	
	
	
	RacingCar myrcar = new RacingCar();
	myrcar.pressButton();
	myrcar.turboAccelerate();
	System.out.println(myrcar.speed);
	System.out.println(myrcar.spoiler);
	
	Person person = new Person();
	person.name = "Peter";
	person.birthYear = 1980;
	person.address = "HongKong";
	Car car1 = new Car();
	car1.owner = person; //separate person class from class, instead, created an owner object inside Car
	Car car2 = new Car();
	car2.owner = person;
	System.out.println(car1.owner.name);
	System.out.println(car2.owner.name);        
	person.address = "Kowloon";
	System.out.println(car1.owner.address);        
	System.out.println(car2.owner.address);  
}}