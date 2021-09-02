package classpart;

public class OrderListStart {

	public static void main(String[] args) {
		
		OrderList orderlist = new OrderList();
		
		orderlist.orderNum = 201803120001L;
		orderlist.ID = "abc123";
		orderlist.date = "2018년 3월 12일";
		orderlist.name = "홍길순";
		orderlist.goodsNum = "PD345-12";
		orderlist.adress = "서울시 영등포구 여의도동 20번지";
		
		
		System.out.println("주문 번호: " + orderlist.orderNum);
		System.out.println("주문자 아이디: " + orderlist.ID);
		System.out.println("주문 날짜: " + orderlist.date);
		System.out.println("주문자 이름: " + orderlist.name);
		System.out.println("주문 상품 번호: " + orderlist.goodsNum);
		System.out.println("배송 주소: " + orderlist.adress);
		
		
	}
}
