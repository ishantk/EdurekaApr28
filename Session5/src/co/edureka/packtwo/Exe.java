package co.edureka.packtwo;

import co.edureka.packone.One;   // public can be imported outside the package
//import co.edureka.packone.Two; // error, default cannot be imported outside the package

// Inheritance Across the Packages
// private and default is not inherited
// public and protected are inherited outside the package
// protected once inherited it behaves like private

import static co.edureka.packone.One.PI;

class Three extends One{
	void show(){
		protShow();
	}
}

public class Exe {

	public static void main(String[] args) {
		
		//One o = new One();
		//o.pvtShow(); // private method cannot be accessed outside the class
		//o.defShow(); // default method cannot be accessed outside the package
		//o.protShow();// protected method cannot be accessed outside the package
		//o.pubShow();
		
		Three t = new Three();
		t.pubShow();
		//t.protShow(); // error since protected method behaves as private
		t.show();
		
		System.out.println("pi is: "+PI);
	}

}
