package com.company;

public class Main {

    /**
     * Parcourir la totalité du tableau
     * @param array - Tableau crée
     */
    public static void displayArray(int[] array) {

        for(int i = 0; i < array.length; i++) {
            System.out.println("score = " + array[i]);
        }
    }

    /**
     * Afficher la valeur maximum du tableau
     * @param array - Tableau crée
     * @return la valeur maximum du tableau
     */
    public static int displayMaxArray(int[] array) {

        int max = 0;

        for(int i = 0; i < array.length; i++) {

            if(max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    /**
     * Retourner vrai ou faux si le tableau contient une valeur inférieure à 10
     * @param array
     * @return true s'il existe une valeur inférieure à 10 et false si l'inverse
     */
    public static boolean displayMinArray(int[] array) {

        for(int i = 0; i < array.length; i++) {

            if(array[i] < 10) {
                return true;
            }
        }

        return false;
    }

    /**
     * Recherche binaire de l'index du résultat voulu dans le tableau
     * @param array - le tableau
     * @param result - Nombre du tableau que nous souhaitons chercher
     * @return l'index du résultat souhaité
     */
    public static int searchBinary(int[] array, int result) {

        int min = 0;
        int max = array.length - 1;
        int index = -1;
        int middle;

        while(min <= max) {
            middle = (min + max)/2;
            if(array[middle] < result) {
                min = middle + 1;
            } else if(array[middle] > result) {
                max = middle - 1;
            } else if(array[middle] == result) {
                index = middle;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
	// write your code here

        int[] scores = new int[7];

        scores[0] = 1;
        scores[1] = 2;
        scores[2] = 3;
        scores[3] = 4;
        scores[4] = 5;
        scores[5] = 6;
        scores[6] = 7;

        displayArray(scores);

        System.out.println("max = " + displayMaxArray(scores));

        System.out.println("min = " + displayMinArray(scores));

        float total = 0;

        for(int i = 0; i < scores.length; i++) {
            total = total + scores[i];
        }

        System.out.println("moyenne = " + total / scores.length);

        int search = searchBinary(scores, 87);

        System.out.println("recherche binaire = " +  search);
    }
}
