package operator;

public class OperatiorEx5 {
	public static void main(String[] args) {
		
		int num1 = 0B00001010; //10
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		
		System.out.println(num2 << 1); //1씩 밀릴떄 마다 (곱)2의 n승
		System.out.println(num2 >> 1); //1씩 밀릴떄 마다 (나누기)2의 n승
		
		
	}
}
