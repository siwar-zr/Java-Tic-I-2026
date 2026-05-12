package generics;

//Generics doivent etre remplacés par des Objects (nom des classes)

public class Demo {
    public static void main(String[] args) {
        IntegerPrinter ip = new IntegerPrinter(2);
        Printer<Integer> pi = new Printer<>(2);

        StringPrinter sp = new StringPrinter("Hello");
        Printer<String> ps = new Printer<>("Hello");

        DoublePrinter dp = new DoublePrinter(4.5);
        Printer<Double> pd = new Printer<>(4.5);


    }
}
