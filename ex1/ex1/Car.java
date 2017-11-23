package ex1;

//extract from car class for cohension
class Person { 
    String name;
    int birthYear;
    String address;
    void payTax(int money) {
    	GovernmentFinder.getInstance().getGovernment().collectMoney(money);
    	
    }
    
}

interface Turbo {
    void toggleTurbo ();
}

interface SpeedInMile {
    final double km2mile = 0.62137;
    int getSpeed();
    int getMilePerHour();
    default double getPreciseMilePerHour() {
        return Math.round(this.getSpeed()*km2mile*100)/100.0;  
    }
}

interface Drive extends SpeedInMile {
    void accelerate();
    void brake();
}

abstract class Vehicle implements Drive {
    int speed;
}

public class Car extends Vehicle{
	char color;
    boolean engineRunning;
   int speed;
//    float speed;
    Person owner;
    
    
    
    
    Car() {
        color = 'W';
        engineRunning = false;
        speed = 0;
        counter1++;
        counter2++;
    }
    
    static int counter1;
    static int counter2;
    static {
        counter1 = 0;
        counter2 = 0;
    }
    
    static void staticmethod2() {
        System.out.println("Car");
    }
    //continue to support int getspeed
    public int getSpeed() {
        return (int) speed; 
    }
    
    void extendLicense(int money) {
    	GovernmentFinder.getInstance().getGovernment().collectMoney(money);
    }
    
    float getSpeed2() {
        return speed;
    }
    //encapsulation-------------------
    char getColor() {
        return color; 
    }
    
    @Override
    public int getMilePerHour() {		// implements SpeedInMile¡¦s method
        return (int) Math.round(speed*km2mile);  
    }
    
    void setColor(char c) {
        if ("WRGB".indexOf(c) >= 0) { 
            color = c; 
        }
    }
    
    void pressButton() {
        engineRunning = ! engineRunning; 
    }

    public void accelerate() {
        if (engineRunning) {
            speed = speed + 10; 
        }
    }

    public void brake() {
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

	void setEngineRunning(boolean b) {
		// TODO Auto-generated method stub
		this.engineRunning = b;
	}
	
	
}
