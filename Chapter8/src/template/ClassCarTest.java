package template;

public class ClassCarTest {
	public static void main(String[] args) {
		
		Car aiCar = new AIcar();
		aiCar.run();
		System.out.println("=============================");
		Car manualCar = new ManualCar();
		manualCar.run();
	}
}
