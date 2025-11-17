package sans.com.encapsulation2;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		if(age<0) {
			System.err.println("not a valid age");
			System.exit(0);
		}
		return this.age;
	}
	

}
