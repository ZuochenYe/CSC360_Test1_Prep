package payroll;

import java.util.ArrayList;


public class Company
{
	ArrayList<Employee> list = new ArrayList<Employee>();
	int num = 0;

	public Company()
	{

	}

	public void adde(Employee a)
	{
		list.add(a);
		this.num = list.size();
	}

	public float[] payments()
	{
		float[] pays = new float[num];
		for (int i = 0; i < num; i++)
		{
			Employee a = list.get(i);
			pays[i] = a.pay();
		}
		return pays;
	}
	
	public int finde(String name)
	{
		for (int i = 0; i < num; i++)
		{
			Employee a = list.get(i);
			if (a.getName().equals(name))
				return i;
		}
		return -1;
	}

	public void change_hour(String name, int hour) throws PersonNonExistException
	{
		int i = finde(name);
		if (i == -1)
			throw new PersonNonExistException();
		else
		{
				list.get(i).setHours(hour);
		}

	}


}
