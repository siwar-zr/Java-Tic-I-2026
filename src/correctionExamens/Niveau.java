package correctionExamens;

import java.sql.SQLOutput;

public class Niveau {
    int numero;
    String theme;
    boolean accessible = true;

    public Niveau(int numero, String theme) {
        this.numero = numero;
        this.theme = theme;
    }

    public void bloquerNiveau(){
        if(!this.accessible){
            System.out.println("Niveau deja bloqué");
        } else {
            this.accessible = false;
        }
    }

    public void afficherDetails(){
        System.out.println("N° : " + this.numero);
        System.out.println("Theme : " + this.theme);
        //System.out.println("Accessibility : " + this.accessible);
        System.out.println(this.accessible ? "Level accessible" : "Level unaccessible");
    }
}
