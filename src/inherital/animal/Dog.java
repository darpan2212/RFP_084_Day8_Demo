package inherital.animal;

public class Dog extends Animal{

	public void run() {
		System.out.println("dog is running at speed of 20 kmph");
	}
	
	@Override
	public void eat() {
		System.out.println("Eating dog food...");
	}
}