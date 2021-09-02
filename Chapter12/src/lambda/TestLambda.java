package lambda;


interface PrintString{
	void showString(String str);
}
	
public class TestLambda {
	public static void main(String[] args) {
		
	
	PrintString lambdaStr = s -> System.out.println(s);
	 lambdaStr.showString("Test");
	 
	 showMyString(lambdaStr);
	 
	 PrintString test = returnSting();
	 test.showString("Test3");
    
	}
  

	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	public static PrintString returnSting() {
		return s->System.out.println(s + "!!!");
	}
}
