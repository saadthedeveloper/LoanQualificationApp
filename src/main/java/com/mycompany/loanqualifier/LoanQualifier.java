/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loanqualifier;

import javax.swing.JOptionPane;

/*This Java program, "Loan Qualifier," uses input from the user about their salary and years on 
the current job to determine if they qualify for a loan. If the user meets certain criteria (atleast 2 years at same job
& annual salary of 30000 USD or more), they are informed they qualify; otherwise, they receive a message indicating why they don't.*/

public class LoanQualifier {

    public static void main(String[] args) {
        double salary;
        double yearsOnJob;
        String input;

        input = JOptionPane.showInputDialog("Enter your annual"
                + " salary");
        salary = Double.parseDouble(input);

        
        input = JOptionPane.showInputDialog("Enter number of years"
                + " on your current job");
        yearsOnJob = Double.parseDouble(input);
        
        if(yearsOnJob>2)
        {
            if(salary >= 30000)
            {
                JOptionPane.showMessageDialog(null, "You qualify for our loan");
            }
            else
            {
                   JOptionPane.showMessageDialog(null, "Your salary has to be"
                           + " more than 30000 USD to qualify for loan"
                           + " as per our policy");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "To qualify for a loan"
                           + " you must have"
                           + " been on your current job for at least two years"
                           + " as per our policy");
        }
     
        System.exit(0);  
       }
}
