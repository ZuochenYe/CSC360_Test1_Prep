package payroll;

public class Employee
{
	String name;
	float rate;
	int hours;

	public Employee(String name, float rate, int hours)
	{

		this.name = name;
		this.rate = rate;
		this.hours = hours;

	}

	@Override
	public String toString()
	{
		return "Employee " + name;
	}

	public float pay()
	{
		return this.rate * this.hours;
	}

	
	public String getName()
	{
		return name;
	}

	
	public void setName(String name)
	{
		this.name = name;
	}

	
	public float getRate()
	{
		return rate;
	}

	
	public void setRate(float rate)
	{
		this.rate = rate;
	}

	
	public int getHours()
	{
		return hours;
	}

	
	public void setHours(int hours)
	{
		this.hours = hours;
	}

}
