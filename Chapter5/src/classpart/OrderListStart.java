package classpart;

public class OrderListStart {

	public static void main(String[] args) {
		
		OrderList orderlist = new OrderList();
		
		orderlist.orderNum = 201803120001L;
		orderlist.ID = "abc123";
		orderlist.date = "2018�� 3�� 12��";
		orderlist.name = "ȫ���";
		orderlist.goodsNum = "PD345-12";
		orderlist.adress = "����� �������� ���ǵ��� 20����";
		
		
		System.out.println("�ֹ� ��ȣ: " + orderlist.orderNum);
		System.out.println("�ֹ��� ���̵�: " + orderlist.ID);
		System.out.println("�ֹ� ��¥: " + orderlist.date);
		System.out.println("�ֹ��� �̸�: " + orderlist.name);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + orderlist.goodsNum);
		System.out.println("��� �ּ�: " + orderlist.adress);
		
		
	}
}
