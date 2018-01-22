package ex4;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//************ Step 3 ***************

//		Calx objectX = new Calx();
//		Caly objectY = new Caly();
//		
//		//no thread is created, runs serially
//		objectX.run();
//		objectY.run();
//
//		//threads created
//		objectX.start();
//		objectY.start();
//		
//		
//		
//		new Cal('x', 100000000).start();
//		new Cal('y', 100).start();
//		
//		
//		new Thread(new Cal1("x1",100000000)).start();
//		new Thread(new Cal1("y1",100)).start();
//		new Cal1("x2",100000000).start();
//		new Cal1("y2",100).start();
//		new Cal2("x3",100000000);
//		new Cal2("y3",100);
//		
		//go in series
		new Aclass('x',1000000).run();
		new Aclass('y',30).run();


		//************ Step 5 ***************

//		new Aclass('x',1000000).start();
//		new Aclass('y',30).start();
	}

}
