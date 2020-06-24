/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 *  If salary is less than or equal to 3000,calculate a new salary with bonus.
 @author srinivsi
 */
public class Payroll 
{

    Payroll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
     public enum Name {Rahul,Abhishek,Sandip,Hardip,Raj};
    
    public enum Salary
    {TwoThousand,ThirtyTwoHundered,TwentyFiveHundered,FourThousand,ThreeThousand  };
   public double Salary;
   public double bonus;
  public String emp;
 
     /**constructor that takes the salary and employee name
      * 
      */
    Payroll(Name n, Salary s) {
        setEmp(n);
        setSalary(s);
       
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(Salary s) {
        this.Salary = Salary;
    }

    public String getEmp() {
        return emp;
    }

    public void setEmp(Name n) {
        this.emp = emp;
    }
    
   public void bonus()
   {
       if(Salary<=3000)
       {
           Salary=Salary*10/100+Salary;
       }
       else 
       {
           this.Salary=Salary;
       }
   }
      public String toString()
      {
          return "Emp name=" emp+"Salary="+Salary;
      }
     
    
    
    
}
