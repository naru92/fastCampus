package classpart;

public class StudentTest {
	public static void main(String[] args) {
		
		
		Student studentLee = new Student();
		studentLee.studentName = "인천";
		studentLee.address= "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
		
	}
}
