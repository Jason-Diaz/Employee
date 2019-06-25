package lab2;
/**
 * <p>Title: Lab #2</p>
 *
 * <p>Description: SalaryEmployee Class - This class extends the Employee class therefore it can use the
 * constructors from that class. This class creates employees and includes their annual salary. Also an accessor
 * method to get the annualSalary, and a mutator method to change annualSalary. This class also has a toString
 *  method.
 *
 * @author Jason Diaz
 */
public class SalaryEmployee
extends Employee
{
	private double annualSalary;

	/**
	 * SalaryEmployee - this default constructor creates a default Employee and instantiates the annulSalary variable
	 * to 0.0.
	 */
	public SalaryEmployee()
	{
		super();
		this.annualSalary = 0.0;
	}

	/**
	 * SalaryEmployee - this parameterized constructor accepts values that will be sent to the employee class
	 * to create an employee object using the parent constructor.
	 * @param l-last name
	 * @param f-first name
	 * @param s-social security number
	 * @param t-job title
	 * @param startY-start year
	 * @param pTD-pay to date
	 * @param annual-annual pay
	 */
	public SalaryEmployee(String l, String f, String s, String t, int startY, int pTD, double annual)
	{
		super(l, f, s, t, startY, pTD);

		this.annualSalary = annual;
	}

	/**
	 * setAnnual- this mutator method allows the annualSalary to be adjusted according to what is sent through
	 * the parameter.
	 * @param a- represent the annual Salary that an employee earns. It is a double and set equal to annualSalary
	 * also a double.
	 */
	public void setAnnual(double a)
	{
		this.annualSalary = a;
	}

	/**
	 * getAnnual- this accessor method allows the programmer to see what is stored in the variable annualSalary
	 * @return a double which is the annual salary of the employee.
	 */
	public double getAnnual()
	{
		return this.annualSalary;
	}

	public double calcWeeklyPay()
	{
		return this.annualSalary / 52.0D;
	}

	public String toString()
	{
		String statement = super.toString() + "\nAnnual salary: " + this.annualSalary;
		return statement;
	}
}
