package correctionExamens;

public abstract class Personnage {
    String nom;
    int niveauActuel = 1;
    int pointsExperience = 0;

    public Personnage(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void gagnerExperience(int points){
        this.pointsExperience += points;
    }

    public void passerNiveau() throws JoueurException{
        /*try{
            if (this.pointsExperience < 100){
                throw new JoueurException("Pas assez de points!");
            }
        } catch (JoueurException e){
            System.out.println(e.getMessage());
        }*/
        if (this.pointsExperience < 100){
            throw new JoueurException("Pas assez de points!");
        }
        this.niveauActuel += 1;
        this.pointsExperience = 0;
    }
}
