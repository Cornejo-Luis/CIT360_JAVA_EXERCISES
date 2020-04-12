/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.TreeSet;
import java.util.Set;

/**
 *
 * @author Luis
 */

class Movie implements Comparable<Movie>{
    
    int id;
    String mov_title, mov_languaje;
    int mov_year;
    int sold, left;
    
    public Movie(int id, String mov_title, String mov_languaje, int mov_year, int sold, int left) {
    this.id = id;
    this.mov_title = mov_title;
    this.mov_languaje = mov_languaje;
    this.mov_year = mov_year;
    this.sold = sold;
    this.left = left;
    }
    @Override
    public int compareTo(Movie m){
        
        if(id > m.id){
        return 1;
        }else if(id < m.id) {
        return -1;
        }else {
        return 0;
        }
        
    }
}

public class TreeSets {
    public static void main(String args[]){
        
        //I will create a list of movie in blank
        Set<Movie> tree_s = new TreeSet<>();
        int x = 1001;
        
        
        // Create Movies with a Dynamically incremented ID number
        Movie m1 = new Movie(x,"Vertigo","English",1958,4,5);
        Movie m2 = new Movie(++x,"The Innocents","English",1961,3,2);
        Movie m3 = new Movie(++x,"Lawrence of Arabia","English",1962,5,1 );
        Movie m4 = new Movie(++x,"The Deer Hunter","English",1978,7,9 );
        Movie m5 = new Movie(++x,"Amadeus","English",1984,2,4);
        
        // Add Movies to the TreeSet
        tree_s.add(m1);
        tree_s.add(m2);
        tree_s.add(m3);
        tree_s.add(m4);
        tree_s.add(m5);
        
        
        //int id, String mov_title, String mov_languaje, int mov_year, int sold, int left
        
        //Iterate and Displya the list
        for(Movie m:tree_s){
            System.out.println("ID: " + m.id +
                               "\nTitle: " + m.mov_title +
                               "\nLanguaje: " + m.mov_languaje +
                               "\nYear: " + m.mov_year +
                               "\nSold: "  + m.sold +
                               "\nLeft: " + m.left + "\n");
        }
        
        
    }
}
