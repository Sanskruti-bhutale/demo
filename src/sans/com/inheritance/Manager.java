package sans.com.inheritance;

public class Manager extends Employee {

	public Manager(String name, double salary) {
		super(name, salary);
		
	}
	public double salary(double bonus) {
		return this.salary+=bonus;
	}
	

}
