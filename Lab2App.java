package lab2;
/**
 * <p>Title: Lab #2</p>
 *
 * <p>Description: Lab2App Class - This class tests various the methods from 
 * the Employee, HoulyEmployee, and SalaryEmployee classes by calling them and by seeing what they return
 * we can fine out if they work or not.
 *
 * @author Jason Diaz
 */
import javax.swing.JOptionPane;

public class Lab2App
{
  public static void main(String[] args)
  {
    String statement = "";
    
    Employee[] workers = new Employee[5];
    
    workers[0] = new HourlyEmployee("Smith", "Mary", 
      "323456789", "Clerk", 1995, 15000.0D, 45.0D, 26.300000000000001D);
    

    workers[1] = new SalaryEmployee("Adams", "Joe", 
      "234567890", "Supervisor", 1995, 23000, 66000.0D);
    
    double pay = ((HourlyEmployee)workers[0]).calcWeeklyPay();
    workers[0].updateTotalPay(pay);
    statement = statement + workers[0].toString() + "\nThis week's pay: " + pay + "\n\n";
    
    pay = ((SalaryEmployee)workers[1]).calcWeeklyPay();
    workers[1].updateTotalPay(pay);
    statement = statement + workers[1].toString() + "\nThis week's pay: " + pay + "\n\n";
    
    statement = statement + "Years served for Salary Employee: " + workers[1].calcYearsOfService(2014);
    
    String statement2;
    
    if(workers[0].compareTo(workers[1]) == 1);
    {
    	statement2 = (workers[0].getLast() + " " + workers[0].getSocSecNum() + "\n" + workers[1].getLast() + " " + workers[1].getSocSecNum());
    }
    if(workers[0].compareTo(workers[1]) == -1)
    {
    	statement2 = (workers[1].getLast() + " " + workers[1].getSocSecNum() + "\n" + workers[0].getLast() + " " + workers[0].getSocSecNum());
    }




    JOptionPane.showMessageDialog(null, statement);
    JOptionPane.showMessageDialog(null, statement2);
  }
}
