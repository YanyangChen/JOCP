package ex1;

public class CarTest {
	    private String name;
	    CarTest(String s) {
	        name = s;
	    }
	    void doTest() {
	        class TestCar {
	            static final double km2mile = 0.62137;
	            private int speed;
	            void accelerate() {
	                speed = speed + 11;
	            }
	        };
	        TestCar c = new TestCar();
	        c.accelerate();
	        System.out.println("Speed for " + name + " : " + c.speed);
	    }
	    void method2() {
	        // TestCar cc = new TestCar();  // Comilation error
	    }
	    static void doTest2() {
	        class TestCar {
	            static final double km2mile = 0.62137;
	            private int speed;
	            void accelerate() {
	                speed = speed + 12;
	            }
	        };
	        TestCar c = new TestCar();
	        c.accelerate();
	        System.out.println("Speed Test : " + c.speed);
	    } 
	    
	    void doTest1() {
	        for (int i=1;i<=5;i++) {
	            int accelerateRate = (int) (Math.random() * 10 + 10);
	            Car testcar = new Car() {
	                public void accelerate() {
	                    speed = speed + accelerateRate;
	                }
	            };
	            testcar.accelerate();
	            testcar.accelerate();
	            System.out.print("Car " + i + " with rate " + accelerateRate);
	            System.out.println(" : " + testcar.speed);
	        }
	    }
	    static void doTest2(int accelerateRate) {
	        Car testcar = new Car() {
	            public void accelerate() {
	                speed = speed + accelerateRate;
	            }
	        };
	        testcar.accelerate();
	        System.out.println(testcar.speed);
	    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
