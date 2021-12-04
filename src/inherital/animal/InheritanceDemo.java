package inherital.animal;

public class InheritanceDemo {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.run();
		dog.eat();

		System.out.println("\n");

		Puppy puppy = new Puppy();
		puppy.eat();
		puppy.run();
		puppy.play();
		System.out.println("\n");
		Cat cat = new Cat();
		cat.eat();
		cat.scratch();
		System.out.println("\n");
		Animal animal = new Dog();
		animal.eat();
		
		System.out.println("\n");
		Animal animal2 = new Cat();
		animal2.eat();
	}

}