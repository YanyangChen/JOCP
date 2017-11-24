package ex2;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		try {
		    System.out.println("For acclerate() : ");
		    java.lang.reflect.Method md = car.getClass().getDeclaredMethod("accelerate");
		    md.invoke(car);
		    System.out.println(car.speed);
		    int mr = md.getModifiers();
		    System.out.println(java.lang.reflect.Modifier.isPrivate(mr));
		    System.out.println();
		    System.out.println("For brake() : ");
		    md = car.getClass().getDeclaredMethod("brake");
		    md.setAccessible(true);
		    md.invoke(car);
		    System.out.println(car.speed);
		    mr = md.getModifiers();
		    System.out.println(java.lang.reflect.Modifier.isPrivate(mr));
		} catch (ReflectiveOperationException ex) {
		    System.out.println(ex);
		}
		System.out.println();
		System.out.println("***************");
		System.out.println();
		try {
		    Class c = Class.forName("javaapplication1.test");
		    System.out.println(java.lang.reflect.Modifier.isFinal(c.getModifiers()));
		    java.lang.reflect.Field f = c.getDeclaredField("test");
		    System.out.println(java.lang.reflect.Modifier.isStatic(f.getModifiers()));
		} catch (ClassNotFoundException|NoSuchFieldException ex) {
		    System.out.println(ex.getClass());
		    System.out.println(ex);
		}
		
		//catching exceptions
		System.out.println("testing******************self made exception objects");
		int[] a = {1, 2, 3, 4};
		try {
		    System.out.println(ArrayInfo.cal(a));
		} catch (ArrayIndexOutOfBoundsException  ex) {
		    System.out.println("Array has invalid number of elements");
		}
		
		int[] a2 = {1, 2, 3, 4, 5, 6, 7};
		try {
		    System.out.println(ArrayInfo.cal2(a2));
		} catch (ArrayIndexOutOfBoundsException  ex) { //catch superclass exception
		    System.out.println("Array has invalid number of elements");
		    System.out.println(ex);//print out subclass exception type
		}
		
		System.out.println("testing******************CarCrashException");
		Car car3 = new Car();
		try {
		    car3.accelerate();
		    car3.accelerate();
		    car3.accelerate();
		    car3.accelerate();
		} catch (CarCrashException ex) {
		    System.out.println(ex.getMessage());
		}
		System.out.println("\n \n "); //adding space lines
		System.out.println("testing******************using simulation object and its subclasses ");
		for (int i=0;i<=5;i++) {
		    Simulation s = new Simulation(i);
		    try {
		        s.doTest();
		        System.out.println("Test " + i + " runs succesfully");
		    } catch (ArithmeticException|ArrayIndexOutOfBoundsException ex ) {
		        System.out.println("Test " + i + " aborted due to " + ex);
		    }
		}
		System.out.println();
		System.out.println("** Simulation Statistics **");
		System.out.println("Test run : " + Simulation.testRun);
		System.out.println("Part1 fails : " + Simulation.part1Error);
		System.out.println("Part2 fails : " + Simulation.part2Error);
		System.out.println("Part3 fails : " + Simulation.part3Error);
		System.out.println("Success : " + Simulation.successRun);
		
		System.out.println("\n \n "); //adding space lines
		System.out.println("testing******************using 2nd simulation object and its subclasses ");
		for (int i=0;i<=5;i++) {
		    Simulation s = new Simulation(i);
		    try {
		        s.doTest2();
		        System.out.println("Test " + i + " runs succesfully");
//		    } catch (SimulationNormalException ex ) {
		    } catch (Exception ex ) {
		        System.out.println("Test " + i + " aborted due to " + ex);
		        System.out.println("       Caused by : " + ex.getCause());
		    }
		}
		
		
		System.out.println(" \n \n testing******************using Car acceleration2 ");
		int i = Integer.parseInt("-5");
		assert(i >= 0): "i is negative with value " + i;
		Car mycar= new Car();
		mycar.accelerate2(i);
		
	}

}
