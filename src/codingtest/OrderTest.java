package codingtest;

public class OrderTest {
	public static void main(String[] args) {
		Order customer1 = new Order();
		customer1.orderNum = "201803210001";
		customer1.orderID = "abc123";
		customer1.orderDate = "2018년 3월 12일";
		customer1.orderName = "최한결";
		customer1.productNum = "PD0345-12";
		customer1.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호: " + customer1.orderNum);
		System.out.println("주문자 아이디: " + customer1.orderID);
		System.out.println("주문 날짜: " + customer1.orderDate);
		System.out.println("주문자 이름: " + customer1.orderName);
		System.out.println("주문 상품 번호: " + customer1.productNum);
		System.out.println("배송 주소: " + customer1.getAddress());

	}

}
