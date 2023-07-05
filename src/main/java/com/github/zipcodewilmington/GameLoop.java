package com.github.zipcodewilmington;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class GameLoop {





        //Start the game
        public static void start() {

            boolean quit = false;
            Character selection;

            //Setting up the loop with start and quit options.

            while (quit == false)  {

                Scanner sc = new Scanner(System.in);
                System.out.println("Hello and Welcome! \n" +
                        "Press Y to get started on our game! \n" +
                        "Or Press Q to quit!");

                selection = sc.nextLine().charAt(0);
                selection = selection.toUpperCase(selection);

                //Making choices from user input

                if (selection == 'Y') {
                    System.out.println("Lets Play!");

                    runGame();


                } else if (selection == 'Q') {
                    System.out.println("See You Next Time!");
                    quit = true;

                } else {
                    System.out.println("Invalid Input, Please Try Again!");


                }

            }


        }

    public static void runGame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String correctWord = "";
        boolean wordGuessed = false;
        boolean minusPressed = false;
        Character userInput;
        int numberOfTries = 0;
        int triesAllowed;


        //Word bank to choose a word from
        String[] wordBank = {"CHOCOLATE", "MIDNIGHT", "PICTURE", "CAMERA", "CHEVY"};

        //Taking the selected word and turning it into an ArrayList of char to compare user input to

        correctWord = wordBank[random.nextInt(wordBank.length)];
        triesAllowed = correctWord.length();

        //ArrayList<Character> letters = new ArrayList<>();
        char[] stringToChar = correctWord.toCharArray();
       // char[] stringToChar = new char[correctWord.length()];


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < correctWord.length(); i++) {
            sb.append("_");
        }

        //Gameplay Loop

        

        while (numberOfTries < triesAllowed && minusPressed != true) {

            System.out.printf("You have %d tries left! \n", triesAllowed);
            System.out.println("Guess a letter!");
            System.out.println(sb);
            userInput = Character.toUpperCase(sc.nextLine().charAt(0));

            if (correctWord.contains(userInput.toString())) {

                for (int i = 0; i < correctWord.length(); i++) {
                    if (userInput == correctWord.charAt(i)) {
                        sb.replace(i, i + 1, userInput.toString());

                    }
                }
                triesAllowed --;

                } else if (!correctWord.contains(userInput.toString())) {
                System.out.println("Wrong Guess! Try Again!");
                triesAllowed --;

            } else if (userInput == '-') {
                minusPressed = true;
            }


        }

        while (numberOfTries >= triesAllowed) {
            System.out.println("G A M E   O V E R");
            System.out.println("You have used up all of your chances!");
            System.out.println("Press any key to restart");
            userInput = sc.nextLine().charAt(0);

            GameLoop.start();

        }



    }



}
