package coopertation;

public class Taxi {

	String companyName;
	int money;
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	public void take(int money) {
		this.money +=money;
	}
	public void showTaixInfo() {
		System.out.println(companyName + "�� ������ "+ money + "�Դϴ�." );
	}
}