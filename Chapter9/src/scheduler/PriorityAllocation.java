package scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� call�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("���� ���õ��� ���� �������� ���� ��� �մϴ�.");
		
	}

}
