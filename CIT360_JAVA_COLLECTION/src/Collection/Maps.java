/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/**
 *
 * @author Luis
 */
class Person{
    private int weight;
    private String name;
    
    public Person(int weight, String name){
    this.weight = weight;
    this.name = name;
}
    @Override
    public String toString() {
        return "Person weight is: " + weight + "; Person name is " + name;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 45 * hash + this.weight;
        hash = 45 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.weight != other.weight) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
}

public class Maps {
    public static void main(String[] args){
        //Hash maps doesn't show objects in the same order
        
        Person person1 = new Person(72, "Luis");
        Person person2 = new Person(58, "Marinelly");
        Person person3 = new Person(25, "Antuanet");
        Person person4 = new Person(16, "Isabella");
        Person person5 = new Person(50, "Estrella");
        Person person6 = new Person(70, "Antenor");
        Person person7 = new Person(60, "Heysell");
        Person person8 = new Person(88, "Miguel");
        
        System.out.println("Create LinkedHashSet using the Map method and add the persons:");
        Map<Person, Integer> map = new LinkedHashMap<>();
        
        // Use put to insert elements to the map
        map.put(person1, 1);
        map.put(person2, 2);
        map.put(person3, 3);
        map.put(person4, 4);
        map.put(person5, 5);
        map.put(person6 ,6);
        map.put(person7 ,7);
        map.put(person8 ,8);
        
        // iterate 
        for(Person key: map.keySet()) { 
            System.out.println("\tKey " + map.get(key) + " - " + key);
        }
        System.out.println("\nCreate an other LinkedHashSet using the Set method:");
        Set<Person> person_set = new LinkedHashSet<>();
        
        // Add items to the set
        person_set.add(person1);
        person_set.add(person2);
        person_set.add(person3);
        person_set.add(person4);
        person_set.add(person5);
        person_set.add(person6);
        person_set.add(person7);
        person_set.add(person8);
        System.out.println("\t" + person_set);
    }
    
}
