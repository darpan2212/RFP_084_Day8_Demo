package constructor;

public class Student {

	public int id;
	public String name;

	public Student(int i, String nm) {
		id = i;
		name = nm;
	}

	public Student() {
		id = 111;
		name = "Jack";
	}
}