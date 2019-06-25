package lab2;
/**
 * <p>Title: Lab #2</p>
 *
 * <p>Description: HourlyEmployee Class - This class extends the employee class therefore this class can use 
 * the constructors from the Employee class. An hourly employee gets their salary depending on how many hours 
 * and their rate of pay therefore the constructors in this class include an employee, hours worked, and rate of
 * pay. 
 *
 * @author Jason Diaz
 */
public class HourlyEmployee
extends Employee
{
	private double hours;
	private double rate;

	public HourlyEmployee()
	{
		super();
		this.hours = 0.0;
		this.rate = 0.0;
	}

	public HourlyEmployee(String l, String f, String ssNum, String t, int startY, double p, double h, double r)
	{
		super(l, f, ssNum, t, startY, p);
		this.hours = h;
		this.rate = r;
	}

	public void setHours(double h)
	{
		this.hours = h;
	}

	public void setRate(double r)
	{
		this.rate = r;
	}

	public double getHours()
	{
		return this.hours;
	}

	public double getRate()
	{
		return this.rate;
	}

	public double calcWeeklyPay()
	{
		return this.hours * this.rate;
	}

	public String toString()
	{
		String statement = super.toString() + "\nHours worked: " + this.hours + "\nRate of pay: " + this.rate;
		return statement;
	}
}
