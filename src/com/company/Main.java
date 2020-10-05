package com.company;

public class Main {

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


        for(int i = 0; i < scores.length; i++) {
            System.out.println("score = " + scores[i]);
        }

        int total = 0;

        for(int i = 0; i < scores.length; i++) {
            total = total + scores[i];
        }

        System.out.println("moyenne = " + total/7);
    }
}
