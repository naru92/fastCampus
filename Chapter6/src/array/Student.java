package array;

import java.util.*;

public class Student {
	
	String studentName;
	int studentID;
	ArrayList<Subject> subjectList;
	
	public Student(String studentName, int studentID ) {
		this.studentName = studentName;
		this.studentID = studentID;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "�л��� " + subject.getName() + "������ ������ " + subject.getScore() + "�� �Դϴ�.");
		}
		System.out.println(studentName + "�л���  ������ "  + total + "�� �Դϴ�." );
	}
	
}
