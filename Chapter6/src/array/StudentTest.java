package array;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student("Lee", 1001);
		
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 90);
		
		Student studentKim = new Student("Kim", 1002);
		
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 90);
		studentKim.addSubject("����", 80);
		
		studentKim.showStudentInfo();
		System.out.println("================================");
		studentLee.showStudentInfo();
	}
}
