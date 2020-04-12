/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelviewcontroller;

/**
 *
 * @author Luis
 */
public class controller {
    
    private int calculationValue;
	private int calculationValue1;
	
	public void addTwoNumbers(int fistNumber, int secondNumber)
	{
		calculationValue = fistNumber + secondNumber;
		
	}
	public void multTwoNumbers(int fistNumber1, int secondNumber1)
	{
		calculationValue1 = fistNumber1 * secondNumber1;
		
	}
	public int getCalculationValue()
	{
		return calculationValue;
	}
	
	public int getCalculationValue1()
	{
		return calculationValue1;
	}
}
