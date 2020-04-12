/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.*;

/**
 *
 * @author Luis
 */
public class Queues {
    public static void main(String[] args){
        
        
        //I will create a Peru soccer team list with LINKED LIST
        Queue<String> LL = new LinkedList<>();
        
        LL.add("Cienciano Cusco");
        LL.add("Universitario Lima");
        LL.add("Melgar Arequipa");
        LL.add("Garcilaso Cusco");
        LL.add("Alianza Lima");
        LL.add("Sport Hauncayo");
        LL.add("Atletico Grau");
        LL.add("UCV Trujillo");
        LL.add("Manucci Trujillo");
        LL.add("Leon Huanuco");
        System.out.println("This is a queue LinkedList of teams: \n" + LL + "\n");
        
        //I will create a Peru soccer team list with the help of ArrayDeque
        Queue<String> AD = new ArrayDeque<String>();
        
        AD.add("Cienciano Cusco");
        AD.add("Universitario Lima");
        AD.add("Melgar Arequipa");
        AD.add("Garcilaso Cusco");
        AD.add("Alianza Lima");
        AD.add("Sport Hauncayo");
        AD.add("Atletico Grau");
        AD.add("UCV Trujillo");
        AD.add("Manucci Trujillo");
        AD.add("Leon Huanuco");
        System.out.println("This is a queue LinkedList of teams: \n" + AD + "\n");
        
        //I will create a Peru soccer team list with the help of  LinkedBlockingDeque
        Queue<String> LBD = new LinkedBlockingDeque<String>();
        LBD.add("Cienciano Cusco");
        LBD.add("Universitario Lima");
        LBD.add("Melgar Arequipa");
        LBD.add("Garcilaso Cusco");
        LBD.add("Alianza Lima");
        LBD.add("Sport Hauncayo");
        LBD.add("Atletico Grau");
        LBD.add("UCV Trujillo");
        LBD.add("Manucci Trujillo");
        LBD.add("Leon Huanuco");
        System.out.println("This is a queue LinkedList of teams: \n" + LBD + "\n");
        
        // Iterate
        System.out.println("This is the iterate List:");
        for (String items: LL) {
        System.out.println(items);
        }
        
        // Use peek to obtain the head of the queue
        System.out.println("\n");
        System.out.println("This is the Head: \n" + AD.peek());
        
        //Add elements to the Quehue(head and tail)
        Deque<String> dequeList = new ArrayDeque<>(AD);
        System.out.println("This is the new list");
        dequeList.addFirst("Laguna Sport - Huancavelica");
        dequeList.addLast("Perla Deportiva - Cajamarca");
        System.out.println("\n");
        System.out.println("This is the new list");
        for (String i: dequeList) {
        System.out.println(i);
        }
        
        //removing elements using poll method
        //Display the first element of the Queue
        System.out.println("\n");
        System.out.println("We will remove The first element of the Queue that is:" + AD.poll());
        //Queue with the first element removed
        System.out.println("New Queue List :");
        for (String j: AD) {
        System.out.println(j);
        }
         
    }
}
