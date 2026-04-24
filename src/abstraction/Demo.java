package abstraction;

//Une méthode abstraite est une méthode sans corps
//Une méthode abstraite doit etre dans une classe abstraite
//Une classe abstraite ne peut pas etre instanciée
//Une classe qui hérite d'une classe abstraite doit impérativement redéfinir ses methodes abstraites
//Une classe abstraite peut ne pas contenir des methodes abstraites. Déclarée abstraite pour éviter l'instanciation


abstract class Shape{

    public abstract void calculerAire();
    public void show(){
        System.out.println("In Shape");
    }
}
abstract class Rectangle extends Shape{
    double hauteur;
    double longueur;

    /*@Override
    public void calculerAire() {
        System.out.println(hauteur*longueur);
    }*/
}
class AdvRectangle extends Rectangle{

    public void calculerAire() {
        System.out.println(hauteur*longueur);
    }
}

public class Demo {
    public static void main(String[] args) {
        Rectangle obj = new AdvRectangle();
        obj.hauteur = 3;
        obj.longueur = 4;
        obj.calculerAire();
        obj.show();
    }
}
