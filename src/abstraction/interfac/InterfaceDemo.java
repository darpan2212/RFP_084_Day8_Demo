package abstraction.interfac;

public class InterfaceDemo {

	public static void main(String[] args) {
		Bank bank = new Icici();
		System.out.println("Interest rate : " + bank.getInterestRate() + "%");
		
		InsuranceCompany ins = new Icici();
		ins.getPremium();
		
//		bank.getPremium();
	}

}
