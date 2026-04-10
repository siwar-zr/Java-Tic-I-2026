class Calculator{
    int a;

    public int add(int a, int b, int c){
        return a+b+c+1;
    }
    public int add(int a, int b){
        return a+b;
    }
/*    public double add(int a, int b){
        return a+b;
    }*/
}

class Computer{

    public void playMusic(){
        System.out.println("Music Playing...");
    }

    public String getMeSmthg(int cost){
        if (cost >= 5){
            return "Something";
        }
        return "Nothing";


    }
}

public class Demo {

    public static void main(String[] args) {
        int num1=4;
        int num2=5;

        Calculator calc = new Calculator();

        System.out.println(calc.add(3,5,5));

/*        Computer comp = new Computer();
        comp.playMusic();
        System.out.println(comp.getMeSmthg(6));*/

    }
}
