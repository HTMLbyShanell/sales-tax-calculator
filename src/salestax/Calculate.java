/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestax;

/**
 *
  * @author Shanell A Spann
 * Course: IT-DEV 140  Programming with JAVA
 * Assignment 2
 * Date:  09/26/2020
 * 
 * Description:  This assignment is to complete programming challenges in the
 * Chapter #2 book of "Starting with JAVA, From Control Structures through Objects".
 * ISBN-13 # 978-0-13-480221-3. This program is Programming Challenge # 7: Sales Tax. 
 * We are to ask a user to enter the amount of a purchase & calculate the sales tax. 
 *
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate{
    
    double stateSalesTaxPercent = 0.04;
    double countySalesTaxPercent = 0.02;
    
    double calculatedStateTax;
    double calculatedCountyTax;
    double totalCombinedTax;
    
    double totalCostWithTax;
    double totalCostWithoutTax;
    DecimalFormat df = new DecimalFormat("0.00");
    Scanner keyboard = new Scanner(System.in);
    
    public void userInput()
    {
        System.out.println("Please Enter Total Cost: ");
        totalCostWithoutTax = keyboard.nextDouble(); 
    }
    
    public void calculateTax()
    {
        calculatedStateTax = (totalCostWithoutTax * stateSalesTaxPercent);
        calculatedCountyTax = (totalCostWithoutTax * countySalesTaxPercent);
        totalCombinedTax = (calculatedStateTax + calculatedCountyTax);
        
    }
    
    public void calculateTotalCost()
    {
        totalCostWithTax = (totalCostWithoutTax + totalCombinedTax);
    }
    
    public void displayTax()
    {
        System.out.println("\nState Sales Tax = $" + df.format(calculatedStateTax));
        System.out.println("County Sales Tax = $" + df.format(calculatedCountyTax));
        System.out.println("Total Sales Tax = $" + df.format(totalCombinedTax));
    }
    
    public void displayCost()
    {
        System.out.println("\nCost excluding tax = $" + df.format(totalCostWithoutTax));
        System.out.println("Total Cost including tax = $" + df.format(totalCostWithTax));
    }
    
}
