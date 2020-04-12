/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Luis
 */

public class FrontController {
    public static void main(String[] arg){
        try{
            Scanner input = new Scanner(System.in);
            ApplicationController calculate = new ApplicationController();
            Integer input1;
            Integer input2;
            String operation;
            
            System.out.println("Insert Side 1 of the triangle");
            input1 = Integer.parseInt(input.nextLine());
            
            System.out.println("Insert Side 2 of the triangle");
            input2 = Integer.parseInt(input.nextLine());
            
            System.out.println("Enter the option (A = area, P = perimeter) ");
            operation = input.nextLine();
		
            System.out.println("The result is");
            calculate.handleRequest(operation, input1, input2);
        }catch (NumberFormatException ex){
            System.out.println(" ");
            System.out.println("Please Enter Valid Numbers");
            System.out.println(" ");
            Scanner input = new Scanner(System.in);
            ApplicationController calculate = new ApplicationController();
            Integer input1;
            Integer input2;
            String operation;
            
            System.out.println("Insert Side 1 of the right triangle");
            input1 = Integer.parseInt(input.nextLine());
            
            System.out.println("Insert Side 2 of the right triangle");
            input2 = Integer.parseInt(input.nextLine());
            
            System.out.println("Enter the option (A = area, P = perimeter) ");
            operation = input.nextLine();
		
            System.out.println("The result is");
            calculate.handleRequest(operation, input1, input2);
        
        } 
    }
}
