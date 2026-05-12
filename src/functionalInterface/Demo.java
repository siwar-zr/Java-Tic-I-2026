package functionalInterface;

@FunctionalInterface //Une interface qui contient une seule méthode
interface A{
    int add(int i, int j);
    //void run();
}
/*class B implements A{
    @Override
    public void show() {
        System.out.println("In B Show");
    }
}*/
public class Demo {
    public static void main(String[] args) {
        //A obj = new A();
        /*A obj = new B();
        obj.show();*/

        A obj = (i,j) -> i+j;


        System.out.println(obj.add(5,1));


    }
}
