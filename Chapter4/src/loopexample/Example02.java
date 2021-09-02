package loopexample;

import java.util.*;

public class Example02 {
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("x값을 입력하세요.");
		int x = scanner.nextInt();
		System.out.println("y값을 입력하세요.");
		int y = scanner.nextInt();
		
		int sum;
		char plus = '+';
	
		
		switch (plus) {
		case '+': sum = x+y;
		System.out.println(x + "+" + y + "=" + sum);
		

		}
	}
}
