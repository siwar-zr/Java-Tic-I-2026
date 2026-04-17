package heritage;

class C {
    int a;
    int b;

    public C(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void show(){
        System.out.println("In C show");
    }
    public void config(){
        System.out.println("In C config");
    }
}
class D extends C{
    int c;
    public D(int a, int b, int c){
        //this.a = a;
        //this.b = b;
        super(a,b);
        this.c = c;
    }

    public void show(){
        System.out.println("In D show");
    }

    @Override
    public void config() {
        super.config();
        System.out.println("Suite");
    }
}
public class Test1 {
    public static void main(String[] args) {
        D obj = new D(1,2,3);
        obj.show();
        obj.config();
    }
}
