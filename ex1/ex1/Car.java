package ex1;

//extract from car class for cohension
class Person { 
    String name;
    int birthYear;
    String address;
}
public class Car {
	char color;
    boolean engineRunning;
   int speed;
//    float speed;
    Person owner;
    Car() {
        color = 'W';
        engineRunning = false;
        speed = 0;
    }
    
    //continue to support int getspeed
    int getSpeed() {
        return (int) speed; 
    }

    float getSpeed2() {
        return speed;
    }
    //encapsulation-------------------
    char getColor() {
        return color; 
    }

    void setColor(char c) {
        if ("WRGB".indexOf(c) >= 0) { 
            color = c; 
        }
    }
    
    void pressButton() {
        engineRunning = ! engineRunning; 
    }

    void accelerate() {
        if (engineRunning) {
            speed = speed + 10; 
        }
    }

    void brake() {
        if (speed >= 10) {
	        speed = speed - 10; 
        } else {
           speed = 0;
        }
        
     
    }
    
    public static void main(String[] args)
    {
    	Car mycar = new Car();
    	mycar.accelerate();
//    	System.out.println(mycar.speed);
    	mycar.pressButton();
    	mycar.accelerate();
    	System.out.println(mycar.speed);
    	mycar.brake();
    	mycar.brake();        
    	System.out.println(mycar.speed);	
    }
}
