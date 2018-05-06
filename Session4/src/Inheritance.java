// Amazon as Shopping Web App
class Product{
	
	int pid;
	String name;
	int price;
	
	// Constructor is executed when the Object is constructed in the memory
	Product(){
		System.out.println("==Product Object Constructed==");
		pid = 1;
		name = "NA";
		price = 0;
	}
	
	void showProductDetails(){
		System.out.println("ID "+pid+" belongs to "+name+" and is priced at \u20b9"+price);
	}
}

class MobilePhone extends Product{
	
	MobilePhone(){
		System.out.println("==MobilePhone Object Constructed==");
	}
}

class IPhoneX extends MobilePhone{
	
	boolean airPodSupprt;
	String faceId;
	
	IPhoneX() {
		System.out.println("==IPhoneX Object Constructed==");
		airPodSupprt = true;
		faceId = "FaceID Feature is Added";
	}
	
	void showCompleteDetails(){
		System.out.println(pid+" | "+name+" is priced at \u20b9"+price+" supports airPods: "+airPodSupprt+"\n"+faceId);
	}
}

class GalaxyNote8 extends MobilePhone{
	
	String sPen;
	
	GalaxyNote8() {
		System.out.println("==GalaxyNote8 Object Constructed==");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
//		Product p1 = new Product();
//		p1.showProductDetails();
		
		//MobilePhone m1 = new MobilePhone();
		
		IPhoneX iRef = new IPhoneX(); // We are constructing the object of IPhoneX which has nothing other than constructor

		// Before the child Object is Constructed, Parent Object will be Constructed. 
		// This is managed automatically
		
		iRef.pid = 1001;
		iRef.name = "IPhoneX";
		iRef.price = 70000;

		//iRef.showProductDetails();
		iRef.showCompleteDetails();
	}

}
