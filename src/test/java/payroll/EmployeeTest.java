package payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest
{
	Company csc360;
	Hourly h1= new Hourly("iamhe1", 12, 30);
	Hourly h2= new Hourly("iamhe2", 13, 40);
	Hourly h3= new Hourly("iamhe3", 14, 50);
	Contractor c= new Contractor("iamc", 15, 50);
	Salary s= new Salary("iams", 16);

	@BeforeEach
	void setUp() throws Exception
	{
		csc360 = new Company();
		csc360.adde(h1);
		csc360.adde(h2);
		csc360.adde(h3);
		csc360.adde(c);
		csc360.adde(s);
		
	}

	@Test
	void testadde()
	{
		assertEquals(5,csc360.num());
		
	}

	@Test
	void testPayments()
	{
		assertArrayEquals(new float[] {360,520,770,750,640}, csc360.payments());
	}

	@Test
	void testfinde()
	{
		assertEquals(-1, csc360.finde("iamhe4"));
		assertEquals(0, csc360.finde("iamhe1"));
	}
	
	@Test
	void testseth() throws PersonNonExistException
	{
		csc360.seth("iamhe2", 30);
		assertEquals(30, h2.getHours());
		
	}
	

}