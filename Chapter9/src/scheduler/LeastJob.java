package scheduler;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�");
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("���� ���йǱ� �װ��� ��� ��Ⱑ ���� �������� ����մϴ�.");
		
	}

}
