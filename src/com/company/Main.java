package com.company;

public class Main {

    static void displayArray(int[] array) {

        for(int i = 0; i < array.length; i++) {
            System.out.println("score = " + array[i]);
        }
    }

    public static int displayMaxArray(int[] array) {

        int max = 0;

        for(int i = 0; i < array.length; i++) {

            if(max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static boolean displayMinArray(int[] array) {

        for(int i = 0; i < array.length; i++) {

            if(array[i] < 10) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
	// write your code here

        int[] scores = new int[7];

        scores[0] = 83;
        scores[1] = 383;
        scores[2] = 2;
        scores[3] = 304;
        scores[4] = 63;
        scores[5] = 86;
        scores[6] = 38;

        System.out.println("max = " + displayMaxArray(scores));

        System.out.println("min = " + displayMinArray(scores));

        float total = 0;

        for(int i = 0; i < scores.length; i++) {
            total = total + scores[i];
        }

        System.out.println("moyenne = " + total / scores.length);
    }
}
