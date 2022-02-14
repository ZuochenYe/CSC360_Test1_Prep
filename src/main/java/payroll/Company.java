package payroll;

import java.util.ArrayList;

public class Company
{
	ArrayList<Employee> list = new ArrayList<Employee>();

	public int num()
	{
		return list.size();
	}
	
	public Company()
	{

	}

	public void adde(Employee a)
	{
		list.add(a);
	}

	public float[] payments()
	{
		float[] pays = new float[list.size()];
		for (int i = 0; i < list.size(); i++)
		{
			Employee a = list.get(i);
			pays[i] = a.pay();
		}
		return pays;
	}
	
	public int finde(String name)
	{
		for (int i = 0; i < list.size(); i++)
		{
			Employee a = list.get(i);
			if (a.getName() == name)
				return i;
		}
		return -1;
	}

	public void seth(String name, int hour) throws PersonNonExistException
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
