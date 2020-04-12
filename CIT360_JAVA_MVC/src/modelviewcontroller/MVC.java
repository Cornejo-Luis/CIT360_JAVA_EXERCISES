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
public class MVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		view theView = new view();
                controller theController = new controller();
                model theModel = new model(theView, theController);
                
		
		theView.setVisible(true);

	}

}
