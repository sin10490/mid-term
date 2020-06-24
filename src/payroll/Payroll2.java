/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Gurjit
 */
public class Payroll2 {
    
     Payroll arr[] = new Payroll[5]; 
 public void nameSalary()
    {
        int counter=0;
        for( Payroll.Name n: Payroll.Name.values())//enhanced for loop - index value not needed
        {
            for(Payroll.Salary s: Payroll.Salary.values())
            {
                arr[counter] = new Payroll(n,s); //object address is stored in arrsay
                counter++;
            }
        }
    }
}
