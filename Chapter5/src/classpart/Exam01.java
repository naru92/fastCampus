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
		
		System.out.println("����: " + this.age 
							+ "\n�̸�: " + this.name
							+ "\n��ȥ����: " + this.married 
							+ "\n�ڳ� ��: " + this.numberOfChildren );
		
	}
	
	
}
