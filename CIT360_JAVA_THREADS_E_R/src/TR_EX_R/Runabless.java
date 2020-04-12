/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TR_EX_R;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */

class ImplementRunner implements Runnable {
    public void run() {
        // run each threads 5 times
        for (int n = 0; n < 5; n++) {
            System.out.println("This is a loop " + n + " of a thread");

            try {
                // insert a half second 
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ImplementRunner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
public class Runabless {
    public static void main(String[] args) {
        
        // Show all three loops running concurrently.
        
        // For each thread, pass an instance of the Runner class to the constructor
        
        // Create the first thread loop
        Thread t1 = new Thread(new ImplementRunner());
        t1.start();
        System.out.println("this is the thread1:");

        // Create the second thread loop
        Thread t2 = new Thread(new ImplementRunner());
        t2.start();

        // Create the third thread loop
        Thread t3 = new Thread(new ImplementRunner());
        t3.start();
    }
}
