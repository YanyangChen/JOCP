package ex2;

class ArrayWith7Elements extends ArrayIndexOutOfBoundsException { }


public class multipleClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class CarCrashException extends RuntimeException {
    CarCrashException(String s) {
        super(s);
    }
}

class SimulationNormalException extends RuntimeException {
    SimulationNormalException() {
    }
    SimulationNormalException(Throwable t) {
        super(t);
    }
}


class Simulation {
    static int testRun;
    static int part1Error;
    static int part2Error;
    static int part3Error;
    static int successRun;
    int intValue;
    Simulation(int i) {
        intValue = i;
    }
    void doTest() {
        testRun++;
        try {
            int i = 10/intValue;
        } catch (ArithmeticException ex) {
            part1Error++;
            throw new ArithmeticException();
        }
        try {
            int[] i = {1,2,3,4};
            int j = i[intValue];
        } catch (ArrayIndexOutOfBoundsException ex) {
            part2Error++;
            throw new ArrayIndexOutOfBoundsException(ex.getMessage());
        }
        try {
            int i = 10/(intValue - 3);
        } catch (ArithmeticException ex) {
            part3Error++;
            throw ex;
        }
        successRun++;
    }
    
    void doTest2() {
        testRun++;
        try {
            int i = 10/intValue;
        } catch (ArithmeticException ex) {
            part1Error++;
            throw new SimulationNormalException();
        }
        try {
            int i = 10/(intValue - 4);
        } catch (ArithmeticException ex) {
            part2Error++;
            throw ex;
        }
        try {
            int[] i = {1,2};
            int j = i[intValue];
        } catch (ArrayIndexOutOfBoundsException ex) {
            part3Error++;
            throw new SimulationNormalException(ex);
        }
        successRun++;
    }
}
