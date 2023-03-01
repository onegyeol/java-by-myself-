package singleton;

public class Car {
	private static int serialNum = 1000;
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum; //�� ��ȯ
	}
	
	public void setCarNum(int carNum) {
		this.carNum = carNum; // �� �ް�
	}
}
