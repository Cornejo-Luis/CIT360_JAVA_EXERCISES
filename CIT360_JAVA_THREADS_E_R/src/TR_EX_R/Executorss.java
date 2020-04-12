/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TR_EX_R;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/**
 *
 * @author Luis
 */
// Task class to be executed (Step 1) 
class Task implements Runnable    
{ 
    private String process; 
      
    public Task(String s) 
    { 
        process = s; 
    } 
      
    // Prints task name and sleeps for 1s 
    // This Whole process is repeated 5 times 
    public void run() 
    { 
    	for (int seg = 3; seg>=0; seg--) 
	{
                System.out.println (seg);
		try {
			Thread.sleep (500);
		    } 
		catch (InterruptedException e) 
	           {
			e.printStackTrace();
		   }
		
                if (seg==0)
                {
                    System.out.println("Go");
                }
	}
        try
        {      
            for (int x = 0; x<=2; x++) 
            { 
                if (x==0) 
                { 
                    Date d = new Date(); 
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
                    //System.out.println("Initialization Time for" + " "+ process +" = " +ft.format(d));
                    System.out.println(process + "Begin the Race" + " = " +ft.format(d)); 
                    //prints the initialization time for every task  
                } 
                else
                { 
                    Date d = new Date(); 
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
                    System.out.println(process + "is winning" + " = " +ft.format(d));   
                    // prints the execution time for every task  
                } 
                Thread.sleep(1000); 
            } 
            System.out.println(process+" complete the Race"); 
        } 
          
        catch(InterruptedException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 
public class Executorss {
    // Maximum number of threads in thread pool 
    static final int MAX_TIMES = 5;              
  
    public static void main(String[] args) 
    { 
        // creates five tasks 
        Runnable p1 = new Task("Anton"); 
        Runnable p2 = new Task("Bart"); 
        Runnable p3 = new Task("Quinn"); 
        Runnable p4 = new Task("Mig"); 
        Runnable p5 = new Task("Dasher");       
          
        // creates a thread pool with MAX_T no. of  
        // threads as the fixed pool size(Step 2) 
        ExecutorService pool = Executors.newFixedThreadPool(MAX_TIMES);
        // passes the Task objects to the pool to execute (Step 3) 
        pool.execute(p1); 
        pool.execute(p2); 
        pool.execute(p3); 
        pool.execute(p4); 
        pool.execute(p5);  
          
        // pool shutdown ( Step 4) 
        pool.shutdown();  
    }
}
