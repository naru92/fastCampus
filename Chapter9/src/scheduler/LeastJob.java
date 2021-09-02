package scheduler;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("현재 상담압므기 앖가니 상담 대기가 없는 상담원에게 배분합니다.");
		
	}

}
