package OCPqueastions;
import java.util.function.*;
import java.util.*;

class bird{
	public void fly() {
		System.out.println("Can Fly"); //object's function
	}
	
}

class Penguin extends bird{
	public void fly() {
		System.out.println("Cannot Fly");//object's function
	}
	
}
public class OCP79 {
	public static void main(String[] args)
	{
		fly(() -> new bird()); //static fly function eating a supplier
		fly(Penguin::new);
	}
	                     //supplier gets nothing but output the object
		static void fly (Supplier<? extends bird> Birdies) //defining what static fly function and supplier should look like
		{
			Birdies.get().fly(); //the supplier eats something that extends the bird, and called Birdies, output the object , and call the object's function
		}
	}


