package OCPqueastions;

interface Rideable
{
	OCP78Car getCar(String name);
}

public class OCP78Car{
	
	private String name;
	public OCP78Car(String name) {
		this.name = name;
	}
	
	public static void main(String args[])
	{
		Rideable rider = OCP78Car::new;
		OCP78Car vehicle = rider.getCar("MyCar");
		//System.out.println( 16 ^ 9);
	}
}
