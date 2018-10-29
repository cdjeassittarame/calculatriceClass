package main.com.company;

import java.util.Scanner;

public class Calcul {
    public double Calcul(String nombre1, String nombre2 , int choix) {


            double integerNombre1 = Double.parseDouble(nombre1);
            double integerNombre2 = Double.parseDouble(nombre2);


            if (choix >= 1 & choix <= 4) {
                switch (choix) {
                    case 1:
                        System.out.println(integerNombre1 + " + " + integerNombre2);
                        integerNombre1 = integerNombre1 + integerNombre2;
                        System.out.println("Resultat: " + integerNombre1);
                        break;
                    case 2:
                        System.out.println(integerNombre1 + " - " + integerNombre2);
                        integerNombre1 = integerNombre1 - integerNombre2;

                        if(integerNombre1 < 0){
                            System.out.println("Resultat: " + Math.abs(integerNombre1) * (-1));
                        }else {
                            System.out.println("Resultat: " + integerNombre1);
                        }
                        break;
                    case 3:
                        System.out.println(integerNombre1 + " * " + integerNombre2);
                        integerNombre1 = integerNombre1 * integerNombre2;
                        System.out.println("Resultat: " + integerNombre1);
                        break;
                    case 4:
                        System.out.println(integerNombre1 + " / " + integerNombre2);
                        integerNombre1 = integerNombre1 / integerNombre2;
                        System.out.println("Resultat: " + integerNombre1);
                        break;
                    default:
                        System.out.println("null");
                }
            }

        return integerNombre1;
    }
}
