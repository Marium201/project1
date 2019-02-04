package constructor;

public class TestTeacher {
	
	public static void main(String[] args) {
		
		Teacher t1 =new Teacher("David");
		
		Teacher t2 = new Teacher(30);
		
		t1.displayInformation();
		t2.displayInformation();
		
		
		
		
	}

}
