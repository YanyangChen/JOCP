package ex1;


//inheritance from Car class 
public class RacingCar extends Car {
	
//	    boolean spoiler;
	    boolean spoiler;
	    float speed;
	    byte engineRunning;  // 0:stopped 1:normal 2:turbo

	    void switchEngineMode(int m) {
	        if (m >= 0 && m<=2) {
	            engineRunning = (byte) m;
	        }
	    }
	  //overriding instant methods
	    void accelerate() {
	        switch (engineRunning) {
	            case 1:
	                speed = speed + 10;
	                break;
	            case 2:
	                speed = speed + 20;
	                break;
	        }}
	    void brake() {
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
