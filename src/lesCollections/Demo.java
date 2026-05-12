package lesCollections;

import java.util.*;

//Collection API -- Concept/idée
//Collection -- Interface
//Collections -- Classe
public class Demo {
    public static void main(String[] args) {

        //int num = 5;
        //int[] nums = new int[5];
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(61);
        nums.add(25);
        nums.add(89);
        nums.add(26);
        nums.add(63);
        nums.add(78);
        //nums.add("4");

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());



        //Suppression (5) avec for loop : à l'avance taille = 4 : 1 7 3
        //Suppression (5) avec iterator : pas de size connu à l'avance juste test s'il reste des elts ou pas : 1 7 3

        //System.out.println(nums.indexOf(2)); //3
        //System.out.println(nums.get(2)); //8



        System.out.println(nums);

        /*for (int n : nums){
            System.out.println(n);
        }*/

        Map<String, Integer> notes = new HashMap<>();
        notes.put("John",50);
        notes.put("Jane",95);
        notes.put("Mark",27);
        notes.put("Suzy",64);
        notes.put("John",75);

        //System.out.println(notes.get("Jane"));
        notes.remove("Mark");
        System.out.println(notes.keySet());

        System.out.println(notes);

        for (String key : notes.keySet()){
            System.out.println(key + " : " + notes.get(key));
        }






    }
}
