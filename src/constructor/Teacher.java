package constructor;

public class Teacher {

	String name;
	int age;
	
	
	public Teacher() {}
	
	public Teacher(String name) {
		
		this.name = name;
		System.out.println(name);
	}
	
	public Teacher(int age) {
		
		this.age = age;
		System.out.println(age);
		
	}
	
	public void displayInformation() {
		
		System.out.println(this.name);
		System.out.println(this.age);
		
	}
}

	