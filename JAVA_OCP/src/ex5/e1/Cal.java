package ex5.e1;

public class Cal extends Thread {
//    char id;
//    int number;
//    Cal(char id, int number) {
//        this.id = id;
//        this.number = number;
//    }
//    public void run() {
//        long sum=0;
//        for (int i=1;i<=number;i++) {
//            sum += i;
//        }
//        System.out.println("The value of " + id + " is " + sum);
//    }
	
//	//************ Step 7 ***************
//
////	class Cal extends Thread {
//	    char id;
//	    int number;
//	    Cal(char id, int number) {
//	        this.id = id;
//	        this.number = number;
//	    }
//	    public void run() {
//	        long sum=0;
//	        for (int i=1;i<number;i++) {
//	            if (id <= 'Z' && i == 1000) {
//	                yield();
//	            }
//	            sum += i;
//	        }
//	        System.out.println("The value of " + id + " is " + sum);
//	    }
	
//	class Cal extends Thread {
	    char id;
	    int number;
	    Cal(char id, int number) {
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
	

	
    public static void main (String args[])
    {
//    	Cal c1 = new Cal('1',11);
//    	c1.start();
//    	//************ Step 3 ***************
//    	Cal cal1,cal2;
//    	for (int i=1;i<11;i++) {
//    	    cal1 = new Cal((char) (64+i), 10000000);
//    	    cal2 = new Cal((char) (96+i), 10000000);
//    	    cal1.start();
//    	    cal2.start();
    	
    	
    	//************ Step 5 ***************
    	Cal cal1,cal2;
    	for (int i=1;i<11;i++) {
    	    cal1 = new Cal((char) (64+i), 10000000);
    	    cal2 = new Cal((char) (96+i), 10000000);
    	    cal1.setPriority(i); //lower case go first
    	    cal2.setPriority(i);
    	    cal1.start();
    	    cal2.start();
    	}
    	
    	
    	
    	
    }
}
