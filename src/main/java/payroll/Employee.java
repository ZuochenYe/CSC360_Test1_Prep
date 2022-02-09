package payroll;

public class Employee {
	String Name;
	int rate;
	int hours;
	
	
	
	public Employee(String name, int rate, int hours) {
		super();
		Name = name;
		this.rate = rate;
		this.hours = hours;
	}
	

	
	public String getName() {
		return Name;
	}
	

	
	public void setName(String name) {
		Name = name;
	}
	

	
	public int getRate() {
		return rate;
	}
	

	
	public void setRate(int rate) {
		this.rate = rate;
	}
	

	
	public int getHours() {
		return hours;
	}
	

	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
}
