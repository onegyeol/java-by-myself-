package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerChoi = new Customer();
		customerChoi.setCustomerID(10010);
		customerChoi.setCustomerName("���Ѱ�");
		customerChoi.bonusPoint = 1000;
		System.out.println(customerChoi.showCustomerInfo());
		
		VIPCustomer customerJang = new VIPCustomer();
		customerJang.setCustomerID(10052);
		customerJang.setCustomerName("��ſ�");
		customerJang.bonusPoint = 10000;
		System.out.println(customerJang.showCustomerInfo());
	}

}
