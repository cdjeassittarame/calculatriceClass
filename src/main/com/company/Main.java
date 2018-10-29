package main.com.company;

import java.util.Scanner;
import main.com.company.model.CalculCase;

public class Main {
    private static int nombreCalcul=0;
    public static void main(String[] args) {

        String nombre1="0";
        String nombre2="0";
        String Recommencer=null;
        int choix = 0;
        String signe = null;


        QuestionTypeCalcul questionTypeCalcul = new QuestionTypeCalcul();
        Calcul calcul = new Calcul();
        CalculCase calculcase = new CalculCase();

        System.out.println("Bienvenue dans votre calculatrice");
        do {

            choix = questionTypeCalcul.QuestionTypeCalcul();
            do {
                if (choix == 5) {
                    nombre1 = "0";
                    choix = questionTypeCalcul.QuestionTypeCalcul();
                } else {
                    signe = calculcase.CalculCase(choix);

                }
            }while (choix == 5);
            if (nombre1 == "0") {
                Scanner scannerNombre1 = new Scanner(System.in);
                System.out.println("Veuillez Choisir un premier nombre");
                nombre1 = scannerNombre1.nextLine();
            }


            Scanner scannerNombre2 = new Scanner(System.in);
            if (nombre1 != "0") {
                System.out.println("Veuillez Choisir un deuxieme nombre à "+ signe +" avec " + nombre1);
            } else {
                System.out.println("Veuillez Choisir un deuxieme nombre");
            }
            nombre2 = scannerNombre2.nextLine();

            try {
                nombre1 = String.valueOf(calcul.Calcul(nombre1, nombre2, choix));


                Scanner scannerRecommencer = new Scanner(System.in);
                System.out.println("Voulez-vous recommencer Y ou N");
                Recommencer = scannerRecommencer.nextLine().toUpperCase();


            } catch (NumberFormatException e) {
                System.out.println("Error: " + e);
                return;
            }

        }while (Recommencer.equals("Y"));

        System.out.println("Merci de votre utilisation");
    }
}
