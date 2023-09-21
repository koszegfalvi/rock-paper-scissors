package hu.progmatic.rockpaperscissors.model;

import java.util.Random;

public class Game {
    private String choiceList[] = {"Rock", "Paper", "Scissor"};
    Random random = new Random();
    private int randomItem = random.nextInt(choiceList.length);
    public String randomChoice = choiceList[randomItem];



}
