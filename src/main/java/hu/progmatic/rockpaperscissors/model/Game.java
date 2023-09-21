package hu.progmatic.rockpaperscissors.model;

import java.util.Random;

public class Game {
    private String choiceList[] = {"Rock", "Paper", "Scissors"};
    Random random = new Random();
    private int randomItem = random.nextInt(choiceList.length);
    public String randomChoice = choiceList[randomItem];
    public String choice;

    public void choice(String choice) {
        this.choice = choice;
    }

    public String choice() {
        return choice;
    }

}
