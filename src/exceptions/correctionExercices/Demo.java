package exceptions.correctionExercices;

public class Demo {
    public static void main(String[] args) {
        Monnaie m1 = new Monnaie(2, "DT");
        Monnaie m2 = new Monnaie(1.5,"USD");

        try{
            Monnaie m4 = m1.ajouter(m2);//
            System.out.println("La monnaie resultat est : " + m4.getValeur() + " " + m4.getDevise());
        } catch (DeviseIncompatible e){
            System.out.println("Les devises " + m1.getDevise() + " et " + m2.getDevise() + " sont incompatibles !");

        }

        Monnaie m3 = new Monnaie(2.5, "DT");

        try{
            Monnaie m5 = m1.ajouter(m3);
            System.out.println("La monnaie resultat est : " + m5.getValeur() + " " + m5.getDevise());
        } catch (DeviseIncompatible e){
            System.out.println("Les devises " + m1.getDevise() + " et " + m2.getDevise() + " sont incompatibles !");

        }
    }
}
