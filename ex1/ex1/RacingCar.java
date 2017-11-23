package ex1;

class RacingCar1 extends Car {
    float speed;
    
    public void accelerate() {
        speed = speed + 12;
    }

    public void brake() {
        speed = speed - 10;
    }

    public int getSpeed () {
        return (int)speed;
    }
}

class RacingCar2 extends Car {
    float speed;

    public void accelerate() {
        speed = speed + 16;
    }

    public void brake() {
        speed = speed - 10;
    }

    public int getSpeed () {
        return (int) speed;
    }
}
//inheritance from Car class 
public class RacingCar extends Car implements Turbo {
	
//	    boolean spoiler;
	    boolean spoiler;
	    float speed;
	    byte engineRunning;  // 0:stopped 1:normal 2:turbo
	    static int counter2;
	    boolean turboState;
	    public void toggleTurbo () {		// implements Turbo¡¦s method
	        turboState = ! turboState;
	    }
	    public void accelerate() {		        // overrides superclass method
	        speed = speed + 10 * (turboState?2:1);
	    }
	    //static variable/method can be inherited. If they are overridden in subclass, 
	    //they are hidden like instant variables
	    RacingCar() {
	        counter2++;
	    }
	    static void staticmethod2() {
	        System.out.println("RacingCar");
	    }
	    void setEngineRunning(boolean b) {
	    	//updating superclass instant variables
	        super.setEngineRunning(b); 
	        engineRunning = (b ? (byte) 1 : (byte) 0);
	    }
	    
	    void setEngineMode(int m) {
	        if (m >= 0 && m<=2) {
	            engineRunning = (byte) m;
	            if (engineRunning == 0) {
	            	//updating superclass instant variables
	                super.setEngineRunning(false);
	            } else {
	                super.setEngineRunning(true);
	            }
	        }
	    }
	    
	    void switchEngineMode(int m) {
	        if (m >= 0 && m<=2) {
	            engineRunning = (byte) m;
	        }
	    }
	  //overriding instant methods
//	    public void accelerate() {
//	        switch (engineRunning) {
//	            case 1:
//	                speed = speed + 10;
//	                break;
//	            case 2:
//	                speed = speed + 20;
//	                break;
//	        }}
	    public void brake() {
	        speed = speed - 10;
	    }
//	    void turboAccelerate() {
//	        if (engineRunning) {
//	          speed=speed+20; 
//	        }
//	    }
	    //overriding instant methods
//	    void accelerate() {
//	        if (engineRunning) {
//	            speed=speed+12;
//	        } 
//	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
