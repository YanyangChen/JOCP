package ex4;
class Cal3 extends Thread {
    char id;
    int number;
    Cal3(char id, int number) {
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
public class ThreadCompare {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal3 calx = new Cal3('x', 100000000);
		Cal3 caly = new Cal3('y', 100);
		System.out.println("Calculation for X and Y started : ");
		calx.start();
		caly.start();
		do {
			//use isAlive() method to check if a thread is still running
		    if (calx.isAlive()) {
		        System.out.println("X");
		    }
		    if (caly.isAlive()) {
		        System.out.println("Y");
		    }
		    try {
		        Thread.sleep(10);
		    } catch (InterruptedException ex) {
		        System.out.println(ex);
		    }
		} while (calx.isAlive() || caly.isAlive()); 
		System.out.println("X and Y calculations completed");

		System.out.println();

		Cal3 cala = new Cal3('a', 100000000);
		Cal3 calb = new Cal3('b', 100);
		cala.start();
		calb.start();
		try {
			//use join() to wait for a thread to complete running
			//suspends the main() thread until the target thread has been completed
			//much simpler without checking isAlive() repeatedly if there is nothing to do before the target
			//thread has finished running
		    cala.join();
		    calb.join();
		} catch (InterruptedException ex) {
		    System.out.println(ex);
		}
		System.out.println("A and B calculations completed");
	}

}
