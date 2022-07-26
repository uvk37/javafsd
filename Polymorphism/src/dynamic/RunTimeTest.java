package dynamic;

public class RunTimeTest {

public static void main(String[] args) {
		
		MacBookPro pro = new MacBookPro();
		pro.start();
//		operateMac(pro);
		
		MacBookAir air = new MacBookAir();
//		operateMac(air);
		
		MacBook obj = new MacBookPro();
		obj.start();
		obj.shutdown();
		
		(new RunTimeTest()).operateMac(air);
		
	}
	
	void operateMac(MacBook mac) {
		mac.start();
		mac.shutdown();
	}
}
