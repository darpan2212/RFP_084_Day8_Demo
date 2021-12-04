package association;

public class AssociationDemo {

	int a = 10;
	
	static AssociationDemo demo = new AssociationDemo();
	
	public static void main(String[] args) {
		Address address1 = new Address("Rajkot", "Gujarat", "India");
		Employee emp1 = new Employee(111, "Rohan", address1);

		System.out.println(emp1.id + " " + emp1.name);
		System.out.println(emp1.address.city + " " + emp1.address.state + " " + emp1.address.country);

		demo.print();
	}
	
	public void print() {
		System.out.println(this.a);
	}
}
