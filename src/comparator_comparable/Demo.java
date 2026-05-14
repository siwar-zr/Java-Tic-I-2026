package comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "age : " + age + " and name : '" + name + '\'';
    }

    @Override
    public int compareTo(Student that) {
        return this.name.length() - that.name.length();
    }
}

public class Demo {
    public static void main(String[] args) {
        //Méthode 1: Création du Comparator / Collections.sort(list, comparator)
        /*List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(29);
        nums.add(72);

        Comparator<Integer> com = (i,j) -> (i%10 > j%10) ? 1 : -1;


        Collections.sort(nums, (i,j) -> (i%10 > j%10) ? -1 : 1);
        System.out.println(nums);

        List<Student> stds = new ArrayList<>();
        stds.add(new Student(20, "aaa"));
        stds.add(new Student(18, "dd"));
        stds.add(new Student(24, "c"));
        stds.add(new Student(21, "bbbb"));

        Comparator<Student> com1 = (s1,s2) -> s1.age - s2.age; //Tri croissant selon l'age
        Comparator<Student> com2 = (s1,s2) -> s1.name.length() - s2.name.length(); //Tri croissant selon la taille du nom
        Comparator<Student> com3 = (s1,s2) -> s1.name.compareTo(s2.name); //Tri croissant selon l'ordre alphabetique du nom

        Collections.sort(stds, com3);
        System.out.println(stds);

        String str1 = "apple";
        String str2 = "tomate";
        System.out.println(str1.compareTo(str2)); //a -> 200 ; b -> 201*/

        //Méthode 2 : Implémentation de l'interface Comparable / Redéfinition de la méthode compareTo / Collections.sort(list)
        /*List<Student> stds = new ArrayList<>();
        stds.add(new Student(20, "aaa"));
        stds.add(new Student(18, "dd"));
        stds.add(new Student(24, "c"));
        stds.add(new Student(21, "bbbb"));

        Collections.sort(stds);
        System.out.println(stds);*/

        //Méthoode 3 : list.sort(Comparator.comparing(Class::getter))
        List<Student> stds = new ArrayList<>();
        stds.add(new Student(20, "aaa"));
        stds.add(new Student(18, "dd"));
        stds.add(new Student(24, "c"));
        stds.add(new Student(21, "bbbb"));

        stds.sort(Comparator.comparing(Student::getName));
        System.out.println(stds);




    }
}
