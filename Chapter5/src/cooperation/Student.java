package cooperation;

public class Student {
	String studentName;
	int grede;
	int money;
	
	
	public Student (String studantName, int money) {
		this.studentName = studantName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	
	
	public void showInfo () {
		System.out.println(studentName +"´ÔÀÇ ³²Àº µ·Àº " + money + "¿ø ÀÔ´Ï´Ù.");
	}
}
