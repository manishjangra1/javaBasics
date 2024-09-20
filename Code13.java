//Collection API

import java.util.*;
public class Code13 {
    public static void main(String[] args) {
        
        //Arraylist is expandable according to use

        //using generics we can speccify the type of the arrayList { <object_type> }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(4);
       // arrayList.add("Manishi");  <-- we can't do so

        System.out.println(arrayList);


        //HashSet
        // it only supports unique values
        // it does not follow any swquence
        // it will not has any index values

        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(4);

        for (Integer n : hashSet) {
            System.out.println(n);
        }

         /* HashSet implements Set Interface but ArrayList implements
     * List that both extends Collection class
     * 
     * HashSet can have only unique values but List can have all values.
     * HashSet does not has index value but List does
     * HashSet does not follows sequence but List does
    */


    /*
     * To achive Key-Value pair we uses Map.
     * HashMap implements Map
     * keys must be unique but they can have same values
    */


    Map<String, String> maps = new HashMap<>();
    maps.put("name", "Manish");
    maps.put("course", "B.tech");

    /* internally keys are basically Set (cannot repeat)
     * values are basically List (can be same)
     */

    }
}

   
