package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VIPCustomer(10020, "������", 12345);
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");
		
		
	}

}
