/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Luis
 */
public class Arrays {
    public static void main(String[] args){
        
        //I will create a Peru soccer team list
        List<String> T = new ArrayList<String>();
        
        //I will add elements to the list
        T.add("Cienciano Cusco");
        T.add("Universitario Lima");
        T.add("Melgar Arequipa");
        T.add("Garcilaso Cusco");
        T.add("Alianza Lima");
        T.add("Sport Hauncayo");
        T.add("Atletico Grau");
        T.add("UCV Trujillo");
        T.add("Manucci Trujillo");
        T.add("Leon Huanuco");
        
        //Display the list of teams
        System.out.println("\t" + T + "\n");
        
        //Remove elements of the list by index
        T.remove(6);
        System.out.println(T);
        T.remove(4);
        System.out.println(T);     
        
        //Add elements of the list by index
        T.add(7,"Llachuabamba Trujillo");
        System.out.println("The new list is:"+"\t" + T + "\n");
        
        //Iterate elements from the List
        T.forEach(t->System.out.println(t));
        System.out.println(" "  + "\n");
        
        //Sort the List
        Collections.sort(T);
        System.out.println("This is the List sorted"  + "\n");
        T.forEach(t->System.out.println(t));
        System.out.println(" "  + "\n");
        
        //Search for elements to the LIst
        if(T.contains("Universitario")){
            System.out.println("Universitario is on the list.\n");
        }else{
            System.out.println("Universitario is not on the list.\n");
        }
        
        // Check the size of the list
        System.out.println("Size of the List");
        System.out.println(T.size() + "\n");
        
        // Use the collection.suffle
        Collections.shuffle(T);
        System.out.println("Suffle List");
        T.forEach(t->System.out.println(t));
        System.out.println(" " + "\n");
        
        // A reversed List
        Collections.sort(T);
        System.out.println("Actual list");
        T.forEach(t->System.out.println(t));
        System.out.println(" " + "\n");
        System.out.println("Reverse List");
        Collections.reverse(T);
        T.forEach(t->System.out.println(t));
    }
}
