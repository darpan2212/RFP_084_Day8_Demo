package abstraction;

import abstraction.interfac.Bank;

public class AbstractDemo {

	int n;
	
	public static void main(String[] args) {
		Bike honda = new HondaBike();
		System.out.println("Honda Speed : "+honda.speed());
		
		Bike yamaha = new Yamaha();
		System.out.println("Yamaha Speed : "+yamaha.speed());
		
	}
	
}