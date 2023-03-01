package singleton;

public class Car {
	private static int serialNum = 1000;
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum; //값 반환
	}
	
	public void setCarNum(int carNum) {
		this.carNum = carNum; // 값 받고
	}
}
