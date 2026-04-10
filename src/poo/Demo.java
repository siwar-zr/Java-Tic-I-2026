package poo;

class Calculator{
    int num = 5;

    //Surcharge des methodes (method overloading)
    public int add(int a, int b){

        return a+b;
    }
    public int add(int a, int b, int c){

        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
}

/*class Computer{
    public void playMusic(){
        System.out.println("Music playing..");
    }

    public String getMeSmthg(int cost){
        if (cost >= 10){
            return "Something";
        }
        return "Nothing";


    }
}*/
public class Demo {
    public static void main(String[] args) {
        /*int num1 = 4;
        int num2 = 5;*/

        int data = 10;
        Calculator obj = new Calculator();
        int result = obj.add(2,5);
        //System.out.println(result);
        //System.out.println(obj);

        Calculator obj1 = new Calculator();
        obj.num = 8;

        System.out.println(obj.num);
        System.out.println(obj1.num);




        /*int result = num1+num2;

        System.out.println(result);*/

        /*Computer obj1 = new Computer();
        obj1.playMusic();
        System.out.println(obj1.getMeSmthg(1));*/

        /*Mobile mo = new Mobile();
        System.out.println(mo.type);*/
    }
}
