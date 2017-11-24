package ex4;

public class ThreadPriorities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cal cal1,cal2;
//		for (int i=1;i<11;i++) {
//		    cal1 = new Cal((char) (64+i), 10000000);
//		    cal2 = new Cal((char) (96+i), 10000000);
//		    cal1.setPriority(i);
//		    cal2.setPriority(i);
//		    cal1.start();
//		    cal2.start();
//		}
		
//		Calyy calyy1,calyy2;
//		for (int i=1;i<11;i++) {
//		    calyy1 = new Calyy((char) (64+i), 10000000);
//		    calyy2 = new Calyy((char) (96+i), 10000000);
//		    calyy1.start();
//		    calyy2.start();
//		}
		
		Calydg calydg1,calydg2;
		for (int i=1;i<11;i++) {
		    calydg1 = new Calydg((char) (64+i), 10000000);
		    calydg2 = new Calydg((char) (96+i), 10000000);
		    calydg1.start();
		    calydg2.start();
		}

	}

}
