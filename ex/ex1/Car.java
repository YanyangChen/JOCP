package ex1;

//extract from car class for cohension
class Person { 
	private static int population;
    private String name;
    Passport[] passports = {};
//    String name;
    static int totPassportCreated;
    int personPassportCreated;
    
    int birthYear;
    String address;
    void payTax(int money) {
    	GovernmentFinder.getInstance().getGovernment().collectMoney(money);
    	
    }
    
    Person() {
//        name = n;
        population++;
    }
    
    Person(String n) {
        name = n;
        population++;
    }
    
    void collectPassport(Passport p) {
        passports = java.util.Arrays.copyOf(passports, passports.length+1);
        passports[passports.length - 1] = p;
    }
    
    void showPassports() {
        System.out.println("Total number of passport(s) : " + passports.length);
        for (Passport p : passports) {
            System.out.print(p.type + " (" + p.serialNumber + ") - ");
            System.out.println(p.getName());
        }
        System.out.println();
    
       
    
    }
    void applyAndCollectPassport(String t, String s) {
        collectPassport(new Passport(t, s));
    }
    
    class Passport {
        private String type;
        private String serialNumber;
        
        Passport(String t, String s) {
            type = t;
            serialNumber = s;
            totPassportCreated++;
            personPassportCreated++;
        }
        
        String getName() {
            return name;
        }
        
        Person getPerson() {
            return Person.this;
        }
        
        int showPopulation() {
            return population;
        }
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
