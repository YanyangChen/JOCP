package ex5;

public class Car {

}

class Car1 implements Comparable<Car1> {
    private String licenseNo;
    Car1 (String s) {
        licenseNo = s;
    }
    public int compareTo(Car1 c) {
        return licenseNo.compareTo(c.licenseNo); 
    }
    public String toString() {
        return licenseNo; 
    }
}

class Car2 {
    private String licenseNo;
    Car2 (String s) {
        licenseNo = s;
    }
    public String toString() {
        return licenseNo; 
    }
}

class Car3 implements Comparable<Car3> {
    int speed;
    private String licenseNo;
    Car3 (String s) {
        licenseNo = s;
    }
    public int compareTo(Car3 c) {
        return (speed - c.speed);      // Car will large speed value is greater
    }
    public String toString() {
        return licenseNo; 
    }
    void accelerate() {
        speed = speed + 10;
    }
}
