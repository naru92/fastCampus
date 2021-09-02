package example;

public class MyDate {
	
	
	private int month;
	private int day;
	private int year;
	
	public boolean isValid = true;
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public int getDay() {
		return day;
    }
	
	public void setDay(int day) {
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if (day<0 || day >31) {
					isValid = false;
				}else {
					this.day = day;
				}
				break;
			case 4: case 6: case 9 : case 11 :
				if (day<0 || day > 30 ) {
					isValid = false;
				}else {
					this.day = day;
				}
				break;
			case 2 :
				if(day<0 || day>28) {
					if(year%4 == 0) {
						this.day =day +1;
					}
				}else if(year%4 != 0){
					this.day = day;
				}
				break;	
				
				
				}
		
		
			}
				public int getYear() {
					return year;
			    }
			public void setYear(int year) {
				if(year < 10000) {
					this.year = year;
				}else {isValid = false;} 
			}
			
			public int getYMonth() {
				return month;
		    }
	
			public void setMonth(int month) {
				if(month < 0 || month >12) {
					isValid = false;
				}else {
					this.month = month;
				}
			}
			public String isValid() {
				if(isValid) {
					return "��ȿ�� ��¥ �Դϴ�";
				}else {
					return "��ȿ���� ���� ��¥�Դϴ�";
				}
			}
		

	
	

	
	
	
}
