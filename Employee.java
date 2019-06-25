package lab2;
/**
 * <p>Title: Lab #2</p>
 *
 * <p>Description: Employee Class - An object of type Employee contains multiple variables
 * to store last, and first names, social security number, job title, the year in which they started,
 * and the total amount of time they have worked for the company. Also includes methods to compare S.S. numbers
 * and a toString.
 *
 * @author Jason Diaz
 */
public class Employee
{
	private String last;
	private String first;
	private String socSecNum;
	private String title;
	private int startYear;
	private double totalPay;

	public Employee()
	{
		this.last = "";
		this.first = "";
		this.socSecNum = "";
		this.title = "";
		this.startYear = 0;
		this.totalPay = 0.0D;
	}

	public Employee(String l, String f, String s, String t, int startY, double p)
	{
		this.last = l;
		this.first = f;
		this.socSecNum = s;
		this.title = t;
		this.startYear = startY;
		this.totalPay = p;
	}

	public String getLast()
	{
		return this.last;
	}

	public String getSocSecNum()
	{
		return this.socSecNum;
	}

	public double getTotalPay()
	{
		return this.totalPay;
	}

	public int calcYearsOfService(int year)
	{
		return year - this.startYear;
	}

	public void updateTotalPay(double p)
	{
		this.totalPay= totalPay + p;
	}
/**
 * compareTo- this method compares the social security number of the object that its being called on with
 * the social security number of the object that is passed through the parameters.
 * @param person- and Employee object which is used to compare social security numbers with another employee.
 * @return returns 1 if the Employee that it is being called on has a higher social security number. 0 if the numbers
 * are the same. -1 if the object that is being passed through the parameter has a higher number.
 */
	public int compareTo(Employee person)
	{
		return this.socSecNum.compareTo(person.getSocSecNum());
	}

	public String toString()
	{
		return 

				this.first + " " + this.last + "\n" + this.socSecNum + "\n" + this.title + "\n" + "Hired: " 
				+ this.startYear + "\n" + "Pay to date: " + this.totalPay;
	}
}
