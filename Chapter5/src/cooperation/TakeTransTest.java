package cooperation;

public class TakeTransTest {
	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentY = new Student("Edward", 12900);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);
		Taxi taxi4885 = new Taxi(4885);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentY.takeTaxi(taxi4885);
		
		
		studentJ.showInfo();
		studentT.showInfo();
		studentY.showInfo();
		
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSubwayInfo();
		
		taxi4885.showTaxiInfo();
		
	}
}
