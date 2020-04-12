/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelviewcontroller;
import java.awt.event.ActionListener;
import javax.swing.*;
public class view extends JFrame{
	
	private JTextField fistNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel ("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("calculate");
	private JTextField calcSolution = new JTextField(10);
		
	view()
	{
                // Sets up the view and adds the components
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		
		calcPanel.add(fistNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		this.add(calcPanel);

		// End of setting up the components --------

	}
	
	public int getFistNumber()
	{
		return Integer.parseInt(fistNumber.getText());
	}
	
	public int getSecondNumber()
	{
		return Integer.parseInt(secondNumber.getText());
	}
	
	public int getCalcSolution()
	{
		return Integer.parseInt(calcSolution.getText());
	}
	
	//-----------------------------------------
	
	public void setCalcSolution(int solution)
	{
		calcSolution.setText(Integer.toString(solution));
	}
        
        // If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed

	void addCalculationListener(ActionListener listenForCalcButton)
	{
		calculateButton.addActionListener(listenForCalcButton);
	}
        
        // Open a popup that contains the error message passed
	void displayErrorMessage(String errorMessage) 
	{
		JOptionPane.showMessageDialog(this,errorMessage);
	}
}
