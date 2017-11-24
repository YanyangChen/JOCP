package ex1;

public class Van implements SpeedInMile{
	 int speed;
	    public void accelerate() {
	        speed = speed + 10;;
	    }
	    public void brake() {
	        speed = speed - 10;
	    }
	    public int getSpeed() {
	        return speed;
	    }
	    public int getMilePerHour() {
	        return (int) Math.round(speed*km2mile);  
	    }
	    public double getPreciseMilePerHour() {
	        return Math.round(this.getSpeed()*km2mile*10000)/10000.0; 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
