package exceptions.correctionExercices;

public class Monnaie {
    private double valeur;
    private String devise;

    public Monnaie(double valeur, String devise) {
        this.valeur = valeur;
        this.devise = devise;
    }

    public double getValeur() {
        return valeur;
    }

    public String getDevise() {
        return devise;
    }

    public Monnaie ajouter(Monnaie m) throws DeviseIncompatible{
        /*try{
            if (!this.devise.equalsIgnoreCase(m.getDevise())){
                throw new DeviseIncompatible("Les devises sont incompatibles");
            }
        }catch (DeviseIncompatible e){
            System.out.println(e.getMessage());
        }*/
        if (!this.devise.equalsIgnoreCase(m.getDevise())){
            throw new DeviseIncompatible("Les devises sont incompatibles");
        }
        return new Monnaie(m.getValeur()+this.valeur, this.devise);
    }
}
