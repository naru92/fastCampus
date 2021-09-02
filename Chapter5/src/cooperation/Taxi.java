package cooperation;

public class Taxi {
	
	int taxiNumber;
	int money;
	int passengerCount;
	
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
				
	}
	public void showTaxiInfo() {
		System.out.println(taxiNumber + "번의 승객은 " + passengerCount + "이고 요금은 " + money + "입니다.");
	}
}
