/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern;

import java.util.HashMap;
import java.math.*;
/**
 *
 * @author Luis
 */
public class PerimeterHandler implements Handlers{
    @Override
    public void handleIt(Integer input1, Integer input2){
        double x = Math.pow(input1,2);
        double y = Math.pow(input2,2);
        double z = Math.sqrt(x+y);
        Double perimeter = (input1+input2+z);
		System.out.println(perimeter);
        }
    public int perimeter(int i, int j) {
        double a = Math.pow(i,2);
        double b = Math.pow(j,2);
        double c = Math.sqrt(a + b);
        double d = (i + j + c);
        int e = Integer.parseInt(Double.toString(d));
	return (e);
    }
}
