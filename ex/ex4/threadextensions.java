/**
 * 
 */
/**
 * @author AC21611
 *
 */
package ex4;

class Calx extends Thread {
    public void run() {
    long sum = 0;
    for (int i=1;i<100000000;i++) {
        sum = sum + i;
    }
    System.out.println("The value of Calx sum is " + sum);
    }
}

class Caly extends Thread {
    public void run() {
    long sum=0;
    for (int i=1;i<100;i++) {
        sum = sum + i;
    }
    System.out.println("The value of Caly sum is " + sum);
    }
}

class Cal extends Thread {
    char id;
    int number;
    Cal(char id, int number) {
        this.id = id;
        this.number = number;
    }
    public void run() {
        long sum=0;
        for (int i=1;i<number;i++) {
            sum = sum + i;
        }
        System.out.println("The value of " + id + " is " + sum);
    }
}

class Cal1 implements Runnable {
    String id;
    int number;
    Cal1(String id, int number) {
        this.id = id;
        this.number = number;
    }
    public void start() {
        Thread objThread = new Thread(this);
        objThread.start();        
    }
    public void run() {
        long sum=0;
        for (int i=1;i<number;i++) {
            sum = sum + i;
        }
        System.out.println("The value of " + id + " is " + sum);
    }
}

class Cal2 implements Runnable {
    String id;
    int number;
    Cal2(String id, int number) {
        this.id = id;
        this.number = number;
        new Thread(this).start();
    }
    public void run() {
        long sum=0;
        for (int i=1;i<number;i++) {
            sum = sum + i;
        }
        System.out.println("The value of " + id + " is " + sum);
    }
}

class Calyy extends Thread {
    char id;
    int number;
    Calyy(char id, int number) {
        this.id = id;
        this.number = number;
    }
    public void run() {
        long sum=0;
        for (int i=1;i<number;i++) {
            if (id <= 'Z' && i == 1000) {
                yield();
            }
            sum += i;
        }
        System.out.println("The value of " + id + " is " + sum);
    }
}

class Calydg extends Thread {
    char id;
    int number;
    Calydg(char id, int number) {
        this.id = id;
        this.number = number;
    }
    public void run() {
        long sum=0;
        for (int i=1;i<number;i++) {
            if (id <= 'Z' && i == 1000) {
                yield();
            }
            if (id == 'G' && i == 1000) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupt occurs");
                }
            }
            sum += i;
        }
        System.out.println("The value of " + id + " is " + sum);
    }
}