package array;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student("Lee", 1001);
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		Student studentKim = new Student("Kim", 1002);
		
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 90);
		studentKim.addSubject("영어", 80);
		
		studentKim.showStudentInfo();
		System.out.println("================================");
		studentLee.showStudentInfo();
	}
}
