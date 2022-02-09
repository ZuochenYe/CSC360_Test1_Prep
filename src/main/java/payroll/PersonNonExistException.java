package payroll;

public class PersonNonExistException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public PersonNonExistException()
	{
		super("Can't find the person.");
	}

	/**
	 * @param message
	 */
	public PersonNonExistException(String message)
	{
		super(message);
	}

	

}
