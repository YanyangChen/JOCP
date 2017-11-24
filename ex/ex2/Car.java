/**
 * 
 */
/**
 * @author AC21611
 *
 */
package ex2;

public class Car {
    int speed;
    void accelerate() {
        speed = speed + 20;
        if (speed > 60) {
            throw new CarCrashException("Speed is " + speed);
        }
    }
    
    void accelerate2(int i) {
        assert(i > 0): "parameter passed is NOT positive : " + i;
        speed = speed + 10 * i;
        System.out.println("Speed is now : " + speed);
    }
    private void brake() {
        speed = speed - 10;
    }
}

class test {
    static int test;
}
