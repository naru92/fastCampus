package array;

public class Alphabet {
	public static void main(String[] args) {
		
		char[] strArrs = new char[26];
		
		char ch = 'A';
		
		for(int i = 0; i<strArrs.length; i++) {
			
			strArrs[i] = ch++;
		}
		
		for( int i = 0; i<strArrs.length; i++)
			System.out.println(strArrs[i] +","+ (int)strArrs[i]);
		
		
		
	}
}
