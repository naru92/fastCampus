package cooperation;

public class Subway {
	
	int subwayNumber;
	int passengerCount;
	int money;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) { //�����޼���
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNumber + "�� ����ö�� �°���" + passengerCount + "�� �̰� ������ " + money + "�Դϴ�.");
	}
}
