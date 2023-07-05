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

                    //runGame();


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
        char userInput;
        int numberOfTries = 0;
        int triesAllowed;

        //Word bank to choose a word from
        String[] wordBank = {"Chocolate", "Midnight", "Chevy", "Keyboard", "Camera"};

        correctWord = wordBank[random.nextInt(0, 4)];
        triesAllowed = correctWord.length();

        //Taking the selected word and turning it into an array of char to compare user input to

        ArrayList<Character> letters = new ArrayList<>();

        for (char character : )

        //Gameplay Loop

        while (numberOfTries < triesAllowed && wordGuessed != true && minusPressed != true) {

            System.out.printf("You have %d tries left!", triesAllowed);
            System.out.println("Guess a letter!");
            userInput = sc.nextLine().charAt(0);

            for (int i = 0; i < letters.length - 1; i++) {
                if (userInput == letters[i]) {
                    System.out.println("Nice!");
                }

            }


            if (userInput == ) {

            } else if (userInput == '-') {
                minusPressed = true;
            }

        }



    }




}
