package constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println(stu.id+"\t"+stu.name);
		
		Student stu2 = new Student(112,"John");
		System.out.println(stu2.id+"\t"+stu2.name);
	}
	
}