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
	}

}
