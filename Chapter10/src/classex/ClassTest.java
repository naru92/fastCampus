package classex;

public class ClassTest {
	
	public static void main(String[] args) {
		
		Person person = new Person("James");
		System.out.println(person);
		
		
		try {
			Class c1 = Class.forName("classex.Person");
			try {
				Person person1 = (Person)c1.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
