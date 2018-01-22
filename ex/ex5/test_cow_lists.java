package ex5;

public class test_cow_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Worker());
		t.start(); 
		try {
		    t.join();
		} catch (InterruptedException ex) { 
		    System.out.println(ex);
		}
		t = new Thread(new Worker());
		t.start();
		int[] result = MyListcow.iterateItem();
		try {
		    t.join();
		} catch (InterruptedException ex) { 
		    System.out.println(ex);
		}
		System.out.println("Item Size at iteration 0 : " + result[1]);
		System.out.println("Item Size at iteration 9999 : " + result[2]);
		System.out.println("Item Count from iteration : " + result[0]);
		System.out.println("Item Size after t2 : " + MyList.list.size());


	}

}
