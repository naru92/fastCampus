package collection.treeset;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberLKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		
		manager.addMeber(memberLee);
		manager.addMeber(memberLKim);
		manager.addMeber(memberPark);
		
		manager.showAllMember();
		
		manager.removeMember(100);
		manager.showAllMember();
	}
}
