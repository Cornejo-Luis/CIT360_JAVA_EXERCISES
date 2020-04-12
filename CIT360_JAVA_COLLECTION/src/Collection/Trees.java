/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.TreeSet;
import java.util.Iterator;

/**
 *
 * @author Luis
 */
public class Trees {
    public static void main(String args[]){
        
        //I will create a list of elements
        TreeSet<String> institute_courses = new TreeSet<>();
        
        institute_courses.add("REL250 - Jesus Christ and the Everlasting Gospel");
        institute_courses.add("REL200 - The Eternal Family");
        institute_courses.add("REL225 - Foundation of the Restoration");
        institute_courses.add("REL275 - Teaching and Doctrine of the Book of Mormon");
        institute_courses.add("REL301 - Old Testament Part1");
        institute_courses.add("REL302 - Old Testament Part2");
        institute_courses.add("REL211 - Net Testament Par1");
        institute_courses.add("REL212 - Net Testament Par2");
        
        //Display the courses
        System.out.println("\t" + institute_courses + "\n");
        
        // Iterate through TreeSet and show sort elements
        Iterator<String> iter = institute_courses.iterator();
            while(iter.hasNext()) {
            System.out.println("\t" + iter.next());
        }
    }
}
