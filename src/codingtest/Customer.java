package codingtest;

public class Customer {
	String customerName;
	int customerAge;
	boolean isMarried;
	int children;
	
	public static void main(String[] args) {
		Customer customerChoi = new Customer();
		customerChoi.customerName = "최한결";
		customerChoi.customerAge = 21;
		customerChoi.isMarried = false;
		customerChoi.children = 0;
		
		System.out.println("이름 : " + customerChoi.customerName);
		System.out.println("나이 : " + customerChoi.customerAge);
		System.out.println("결혼여부 : " + customerChoi.isMarried);
		System.out.println("자식 수 : " + customerChoi.children);
		

	}

}
