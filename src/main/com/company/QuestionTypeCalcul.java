package main.com.company;

import java.util.Scanner;

public class QuestionTypeCalcul {

    private String Calcul=null;
    private int integerCalcul=0;

    public int QuestionTypeCalcul() {

        System.out.println("Veuillez Choisir un type de calcul");

        do {
            Scanner scannerCalcul = new Scanner(System.in);
            System.out.println("1.Addition 2.Soustraction 3.Multiplication 4.Division 5.Reset");
            Calcul = scannerCalcul.nextLine();
            integerCalcul = Integer.parseInt(Calcul);
        } while (integerCalcul < 1 | integerCalcul > 5);
        return integerCalcul;
    }
}
