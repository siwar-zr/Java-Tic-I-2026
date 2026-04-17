package heritage;

class A extends Object{

    int marks;
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int a){
        super();
        System.out.println("in A int");
    }
    public void show(){}
}
class B extends A{
    public B(){
        //super(1); // in A int
        this(5);
        System.out.println("in B");
    }
    public B(int a){
        //super(a);
        //this();
        System.out.println("in B int");
        //super.show();
        //System.out.println(super.marks);
    }
}
public class Test {
    public static void main(String[] args) {
        B obj = new B();
    }
}
