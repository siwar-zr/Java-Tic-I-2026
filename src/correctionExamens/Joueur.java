package correctionExamens;

public class Joueur extends Personnage implements IJoueur{
    String specialite;

    public Joueur(String nom, String specialite){
        super(nom);
        this.specialite = specialite;
    }



    @Override
    public void jouerTour() {
        System.out.println("It's your turn to play !");
    }

    public boolean aMemeSpecialite(Joueur autre){
        return this.specialite.equalsIgnoreCase(autre.specialite);
    }

    public void afficherResume(){
        System.out.println("Name : " + this.nom);
        System.out.println("Speciality : " + this.specialite);
        System.out.println("Level : " + this.niveauActuel);
        System.out.println("Experience : " + this.pointsExperience);
    }
}
