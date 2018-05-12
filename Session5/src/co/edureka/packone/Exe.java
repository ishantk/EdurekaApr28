package co.edureka.packone;

// Within the same package, we can access all the methods other than private for public as well as default class..

public class Exe {

	public static void main(String[] args) {
		
		One o = new One();
		//o.pvtShow(); // private method cannot be accessed
		o.defShow();
		o.protShow();
		o.pubShow();
		
		System.out.println("======================");
		
		Two t = new Two();
		//t.pvtShow(); // private method cannot be accessed
		t.defShow();
		t.protShow();
		t.pubShow();
		

	}

}
