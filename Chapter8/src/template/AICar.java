package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� �����մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}

	public void washCar() {
		System.out.println("�ڵ� ���� �մϴ�.");
	}

}