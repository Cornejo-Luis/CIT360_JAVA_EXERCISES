/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Luis
 */
public class Sets {
    public static void main(String[] args) {
        
        Set<String> institute_courses = new HashSet<String>();
        
        //Check if SetList is empty
        if(institute_courses.isEmpty()) {
            System.out.println("Courses Set is empty:");
            System.out.println("\t" + institute_courses + "\n");            
        }
        
        //Set myOrderedSet = new LinkedHashSet(institute_courses);
        
        //Add courses
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
        
        // Sets do not accept duplicated element on the list
        institute_courses.add("REL211 - Net Testament Par1");
        institute_courses.add("REL212 - Net Testament Par2");
        
        //Display the courses again to see if the elements are included on the list
        System.out.println("\t" + institute_courses + "\n");
        
        // Insert new elements to the set list
        institute_courses.add("REL324 - Doctrine and Convenats Par1");
        institute_courses.add("REL325 - Doctrine and Convenats Par2");
        
        //This is a Sort List
        TreeSet<String> sortList = new TreeSet<String>(institute_courses);
        System.out.println("The sorted list is:");
        System.out.println(sortList);
        
        // Iterate the Set list
        sortList.forEach((elem) -> {System.out.println("\t" + elem);});
        
        //shows the first list
        System.out.println(institute_courses);
        
        //Show the second list
        System.out.println(sortList);    
        
        // To see what elements intersect between the two sets use the retains method
        sortList.retainAll(institute_courses);
        System.out.println("Courses common to both lists are: \n\t" + sortList +"\n");
        
        //I will create another different list and I will compare elements
        Set<String> equal = new HashSet<>();
        equal.add("REL 327 - The Pearl of Great Price");
        equal.add("REL 150 - The Gospel and the Productive Life");
        equal.add("REL 130 - Missionary Preparation");
        equal.add("REL 215 - Scripture Study-The Power of the Word");
        equal.add("REL325 - Doctrine and Convenats Par2");
        
        //I will compare the sortList with the setlist "equal"
        sortList.retainAll(equal);
        System.out.println("courses in both lists are: \n\t" + sortList +"\n");
        
        // I will see the difference between this two list
        Set<String> diff = new HashSet<>(equal);
        diff.removeAll(sortList);
        System.out.println("Courses in the first list that are NOT in the second list are: \n\t" + diff);
    }
}
