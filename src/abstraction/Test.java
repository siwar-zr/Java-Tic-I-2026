package abstraction;
//class - class : extends
//class - interface : implements
//interface - interface : extends

interface A{
    int marks = 9;  //final static
    String type = "Type";
    void show();  // public abstract
    void config();
}

interface A2{
    void test();
}

class B implements A,A2{
    @Override
    public void show() {
        System.out.println("In show");
    }
    @Override
    public void config() {
        System.out.println("In config");
    }

    @Override
    public void test() {
        System.out.println("In test");
    }


}

interface X extends A{
    void fly();
}

class Y implements X{
    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void show() {
        System.out.println("In Y show");
    }

    @Override
    public void config() {
        System.out.println("In Y config");
    }
}
public class Test {
    public static void main(String[] args) {

        /*A obj;
        obj = new B();
        obj.show();
        obj.config();
        //obj.marks = 10;
        System.out.println(A.marks);

        A2 obj2 = new B();
        obj2.test();

        B obj3 = new B();
        obj3.show();
        obj3.config();
        obj3.test();*/

        X obj = new Y();
        obj.fly();
        obj.show();
        obj.config();

    }
}
