package codingtest;

public class Customer {
	String customerName;
	int customerAge;
	boolean isMarried;
	int children;
	
	public static void main(String[] args) {
		Customer customerChoi = new Customer();
		customerChoi.customerName = "���Ѱ�";
		customerChoi.customerAge = 21;
		customerChoi.isMarried = false;
		customerChoi.children = 0;
		
		System.out.println("�̸� : " + customerChoi.customerName);
		System.out.println("���� : " + customerChoi.customerAge);
		System.out.println("��ȥ���� : " + customerChoi.isMarried);
		System.out.println("�ڽ� �� : " + customerChoi.children);
		

	}

}
