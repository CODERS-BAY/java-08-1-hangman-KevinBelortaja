package com.codersbay;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = new String[] {"computer", "screen", "java", "keyboard", "phone"};

        String randomWord =  words[(int) (Math.random()* words.length)];
        char [] letters = new char[randomWord.length()];

        for (int i = 0; i<letters.length; i++) {
            letters[i] = '-';
        }

        int lives = 5;

        while (lives>0) {
            System.out.print("Lives: ");

            for (int i = 0; i<lives; i++) {
                System.out.print("X");
            }
            System.out.println();

            System.out.println("Write a letter: ");

            String input = scan.nextLine();

            char letter = input.charAt(0);



            boolean isGuessCorrect = false;

            for (int i = 0; i <randomWord.length(); i++) {
                char l = randomWord.charAt(i);

                if (l == letter) {
                    letters[i] = l;
                    isGuessCorrect = true;
                }
            }

            if (!isGuessCorrect){
                lives--;
            }

            boolean gameFinished = true;

            System.out.println("Word: ");

            for (int i = 0; i<letters.length; i++) {
                if (letters[i] == '-') {
                    gameFinished = false;
                }

                System.out.print(letters[i]);
            }
            System.out.println();

            System.out.println("-------------------------");

            if (gameFinished) {
                System.out.println("You won!");
                break;
            }

            if (lives == 0) {
                System.out.println("You lost! The word was: " + randomWord);
            }
        }





    }

}
