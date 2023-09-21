package hu.progmatic.rockpaperscissors.service;

import hu.progmatic.rockpaperscissors.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService {

    private Game game;
  public String choiceList[] = {"Rock", "Paper", "Scissor"};
    Random random = new Random();
    private int randomItem = random.nextInt(choiceList.length);
    public String randomChoice = choiceList[randomItem];

    @Autowired
    public GameService(Game game) {
        this.game = game;
    }

    public String whoWin(String choice) {
        if (choice.equals("Rock") && randomChoice.equals("Scissors")) {
            return "You win!";
        }
        if (choice.equals("Rock") && randomChoice.equals("Paper")) {
            return "The computer wins!";
        }
        if (choice.equals("Paper") && randomChoice.equals("Scissors")) {
            return "The computer wins!";
        }
        if (choice.equals("Paper") && randomChoice.equals("Rock")) {
            return "You win!";
        }
        if (choice.equals("Scissors") && randomChoice.equals("Rock")) {
            return "The computer wins!";

        }
        if (choice.equals("Scissors") && randomChoice.equals("Paper")) {
            return "You win!";
        }
        return "equals!";
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String[] getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(String[] choiceList) {
        this.choiceList = choiceList;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getRandomItem() {
        return randomItem;
    }

    public void setRandomItem(int randomItem) {
        this.randomItem = randomItem;
    }

    public String getRandomChoice() {
        return randomChoice;
    }
}
