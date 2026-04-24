package finalKeyword;
//final - variable (constante), method (pas de override), class (pas d'héritage)

final class Calc{
    public final void show(){
        System.out.println("In Calc Show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
/*class Abc extends Calc{
    *//*@Override
    public void show() {
        System.out.println("In Abc Show");
    }*//*
}*/
public class Demo {

    public static void main(String[] args) {
        /*final int num;
        num = 9;
        //num = 10;
        System.out.println(num);*/

        Calc obj = new Calc();
        obj.show();
        obj.add(1,2);

    }
}
