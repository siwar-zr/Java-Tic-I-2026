package heritage;

class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
public class Demo {
    public static void main(String[] args) {

        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(1,2);
        int r2 = obj.sub(5,1);
        int r3 = obj.multi(3,2);
        int r4 = obj.div(4,2);
        double r5 = obj.power(3,2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
// Java ne supporte pas l'heritage multiple
    }
}
