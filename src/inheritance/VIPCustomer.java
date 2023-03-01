package inheritance;

public class VIPCustomer extends Customer {
	private int agentID; //VIP ������ ���� �������� VIP�� ��� ���� ID
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	

	public int getagentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price-(int)(price*saleRatio);
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "��� ������ ���̵�� "+ agentID+"�Դϴ�";
	}
}
