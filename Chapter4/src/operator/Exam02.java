package operator;

import java.util.*;

public class Exam02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = 0;
		switch(month) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
				
				day = 31;
				break;
				
			case 2 :
			
				day = 28;
				break;
			
			case 4 : case 6 : case 9 : case 11 :
				
				day = 30;
				break;
		
			default:
					System.out.println("Error");
					day = 0;
			
			
		}
		
		System.out.println(month + "���� " + day + "�� ���� �ֽ��ϴ�");
		
	}
}
