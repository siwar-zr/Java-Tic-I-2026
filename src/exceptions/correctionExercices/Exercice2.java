package exceptions.correctionExercices;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier valide :");
        String str = sc.nextLine();
        int nb;

        try {
            nb = Integer.parseInt(str);//
            System.out.println("Le nombre est " + nb);
        } catch (NumberFormatException e){
            System.out.println("La chaine n'est pas valide");
        }


    }
}
