package com.omiekue.trivia3;

import java.util.*;
public class TriviaInterface {


    private List<TriviaData> td = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public int points = 0;


    public void startGame(){
        populateQuestions();
        gameLoop();
    }

    public void gameLoop(){
        while (true) {
            for (TriviaData triviaData : td) {
                System.out.println(triviaData.getQuestion());
                if (userInput().equals(triviaData.getAnswer())){
                    System.out.println("Correct");
                    points++;
                }else {
                    System.out.println("Incorrect! It is " + triviaData.getAnswer());
                }
            }
            System.out.println("Your total score is: " + points);
            if(doYouWishToContinue());{
                Collections.shuffle(td);
            }
        }//while
    }

    private void populateQuestions(){

        System.out.println("Populating the questions...");

        td = new ArrayList<>();

        td.add(new TriviaData("What is 1 + 1?", "2"));
        td.add(new TriviaData("What is 2 + 2?", "4"));
        td.add(new TriviaData("What is 3 + 3?", "6"));
        td.add(new TriviaData("What is 4 + 4?", "8"));
        td.add(new TriviaData("What is 5 + 5?", "10"));
        td.add(new TriviaData("What is 6 + 6?", "12"));
        td.add(new TriviaData("What is 7 + 7?", "14"));
        td.add(new TriviaData("What is 8 + 8?", "16"));
        td.add(new TriviaData("What is 9 + 9?", "18"));
        td.add(new TriviaData("What is 10 + 10?", "20"));
        Collections.shuffle(td);
    }

    private String userInput(){
        return scanner.nextLine();
    }


    private boolean doYouWishToContinue(){
        System.out.println("Do you wish to continue? Y or N");
        String answer = userInput();
        if (answer.toLowerCase().equals("y")){
            System.out.println("Re-shuffling the questions...");
            System.out.println("Resetting points...");
            points = 0;
            return true;
        }else {
            System.out.println("Goodbye!");
            System.exit(1);
            return false;
        }
    }
}
