package collection.map;

public class MemberHashMapTest {
	public static void main(String[] args) {
		
		MemberHashMap manager = new MemberHashMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberLKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		
		manager.addMember(memberLee);
		manager.addMember(memberLKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		System.out.println();
		

	}
}
