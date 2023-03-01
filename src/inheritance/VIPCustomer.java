package inheritance;

public class VIPCustomer extends Customer {
	private int agentID; //VIP 고객만을 위한 할인율과 VIP고객 담당 상담원 ID
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
		return super.showCustomerInfo() + "담당 상담원의 아이디는 "+ agentID+"입니다";
	}
}
