package correctionExamens;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JeuSplitFiction {
    List<Joueur> joueurs = new ArrayList<>();
    List<Niveau> niveaux = new ArrayList<>();

    public void ajouterJoueur(Joueur j){
        if (joueurs.contains(j)){
            System.out.println("Joueur déjà ajouté");
        } else {
            this.joueurs.add(j);
        }
    }

    public void ajouterNiveau(Niveau n){
        this.niveaux.add(n);
    }

    void joueurPasseNiveau(String nomJoueur){
        List<Joueur> filtered = this.joueurs.stream()
                .filter(j -> j.nom.equalsIgnoreCase(nomJoueur))
                .toList();
        if (filtered.isEmpty()){
            System.out.println("Joueur inexistant !");
            return;
        }
        Joueur j = filtered.get(0);
        try{
            j.passerNiveau();
        } catch(JoueurException e){
            System.out.println(e.getMessage());
        }

    }

    public void supprimer(int indice){
        if (this.joueurs.isEmpty()){
            System.out.println("La liste est vide");
        } else {
            this.joueurs.remove(indice);
        }
    }

    public boolean trouverJoueurParNom(String nom){
        List<Joueur> filtered = this.joueurs.stream()
                .filter(j -> j.nom.equalsIgnoreCase(nom))
                .toList();
        return !filtered.isEmpty();
    }

    public void trierJoueurs(){
        this.joueurs.sort(Comparator.comparing(Joueur::getNom));
        System.out.println("Liste triée : " + this.joueurs);
    }
}
