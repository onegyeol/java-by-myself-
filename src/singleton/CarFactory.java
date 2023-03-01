package singleton;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {};
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();//Car인스턴스 생성
		return car;
	}
	
	
}
