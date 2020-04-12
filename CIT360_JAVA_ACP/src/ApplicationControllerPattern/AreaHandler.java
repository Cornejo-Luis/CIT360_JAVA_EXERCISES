/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern;

import java.util.HashMap;
//import JSON.quickconnectfamily;

/**
 *
 * @author Luis
 */
public class AreaHandler implements Handlers{
    @Override
    public void handleIt(Integer input1, Integer input2){
        Integer area = (input1 * input2)/2;
		System.out.println(area);
        }
    public int area(int i, int j) {
	return (i * j)/2;
    }
    
}