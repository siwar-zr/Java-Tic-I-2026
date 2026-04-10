package poo;

class Mobile{

    String brand;
    int price;
    static String type = "Phone";

    public void infos(){
        System.out.println(brand + " : " + price + " : " + type);
    }

    public static void show(Mobile m){
        System.out.println(m.brand + " : " + m.price + " : " + type);
    }
}
public class Test {
    public static void main(String[] args) {

        Mobile obj = new Mobile();
        obj.brand="Apple";
        obj.price=2000;
        obj.type="Smartphone";

        Mobile obj1 = new Mobile();
        obj1.brand="Samsung";
        obj1.price=2500;
        obj1.type="Smartphone";

        Mobile.type = "Phone";

        obj1.type = "aaa";

        obj.infos();
        obj1.infos();
        Mobile.show(obj1);

        obj.show(obj1);



    }
}
