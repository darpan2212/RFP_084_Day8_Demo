package abstraction.interfac;

public class Icici implements Bank, InsuranceCompany {

	@Override
	public void getPremium() {
		System.out.println("Annual Premium : 7800 INR");
	}

	@Override
	public int getInterestRate() {
		return 7;
	}

}
