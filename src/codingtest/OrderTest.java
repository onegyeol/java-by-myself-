package codingtest;

public class OrderTest {
	public static void main(String[] args) {
		Order customer1 = new Order();
		customer1.orderNum = "201803210001";
		customer1.orderID = "abc123";
		customer1.orderDate = "2018�� 3�� 12��";
		customer1.orderName = "���Ѱ�";
		customer1.productNum = "PD0345-12";
		customer1.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ: " + customer1.orderNum);
		System.out.println("�ֹ��� ���̵�: " + customer1.orderID);
		System.out.println("�ֹ� ��¥: " + customer1.orderDate);
		System.out.println("�ֹ��� �̸�: " + customer1.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + customer1.productNum);
		System.out.println("��� �ּ�: " + customer1.getAddress());

	}

}
