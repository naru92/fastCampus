package operator;

import java.util.*;

public class Exam01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int record = sc.nextInt();
		
		String grade = null;
		
		if(record >= 90) {
			grade = "A";
			
		}else if(record  >=80) {
		    grade = "B";
		   
		}else if(record >= 70){
			grade = "C";
			
		}else if(record >= 60) {
			grade = "D";
			
		}else {
			grade = "F";
		
		}
		System.out.println("점수 : " + record);
		System.out.println("학점 : " + grade);
		
	}
}
