package loopexample;

public class ForExample {
	public static void main(String[] args) {
		
		int count;
		int sum =0;
		
		for (count = 0; count <10; count++) {
			sum += count;
		} 
		System.out.println(sum);
		
		
		for(count= 0 ; count <= 100; count++) {
			sum += count;
		}
		System.out.println(sum);
	}
}
