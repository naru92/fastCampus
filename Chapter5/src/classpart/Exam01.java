package classpart;

public class Exam01 {
	
	int age;
	String name;
	boolean married;
	int numberOfChildren;
	
	
	public void jamesInfo(int age, String name, boolean married, int numberOfChildren ) {
		this.age = age;
		this.name = name;
		this.married = married;
		this.numberOfChildren = numberOfChildren;
		
		System.out.println("나이: " + this.age 
							+ "\n이름: " + this.name
							+ "\n결혼여부: " + this.married 
							+ "\n자녀 수: " + this.numberOfChildren );
		
	}
	
	
}
