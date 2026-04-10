package encapsulation;

import java.util.Scanner;

class Human{
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(int age) {
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }


}
public class Demo {
    public static void main(String[] args) {

        /*Human h1 = new Human(19,"Mark");
        *//*h1.setAge(11);
        h1.setName("John");*//*

        Human h2 = new Human("John");

        System.out.println(h1.getName() + " : " + h1.getAge());
        System.out.println(h2.getName() + " : " + h2.getAge());*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez votre age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Donnez votre nom : ");
        String name = sc.next();



        Human obj = new Human(age,name);
        System.out.println(obj.getName() + " : " + obj.getAge());


    }
}
