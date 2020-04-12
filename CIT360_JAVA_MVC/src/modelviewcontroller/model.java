/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelviewcontroller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Luis
 */
public class model {
    private view theView;
    private controller theController;
    
    public model(view theView,controller theController){
        this.theView = theView;
        this.theController = theController;
        
        this.theView.addCalculationListener(new CalculateListener());
    }
    class CalculateListener implements ActionListener{
        
        @Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int fistNumber, secondNumber = 0;
			//int fistNumber1, secondNumber1 = 0;
			
			try {
				fistNumber = theView.getFistNumber();
				secondNumber =theView.getSecondNumber();
				
                                theController.addTwoNumbers(fistNumber, secondNumber);
                                theView.setCalcSolution(theController.getCalculationValue());
                             }
			
			catch(NumberFormatException ex)
                            {
				theView.displayErrorMessage("You need to enter 2 Integers");
                            }   
                        }
    }
    
}
