package RockPaperScissors;

public class Players {
    private String playerName;
    private int maxNumberOfTries;


    // declare new constructor
    public Players(String definedPlayerName) {
        playerName = definedPlayerName;
    }

    public String giveMeYourPlayerName() {
        return playerName;
    }

    // NumberGenerator

    public static gameSetup[] possibilities = gameSetup.values();
    public static gameSetup playerOneGuess = possibilities[(int) (Math.random() * 3)];
    public static gameSetup playerTwoGuess = possibilities[(int) (Math.random() * 3)];

    public void matchGame() {
        if (playerOneGuess == playerTwoGuess)
            System.out.println("Go for another its a Draw");
        else if ((playerOneGuess == gameSetup.ROCK && playerTwoGuess == gameSetup.SCISSORS) || (playerOneGuess == gameSetup.PAPER && playerTwoGuess == gameSetup.ROCK) || (playerOneGuess == gameSetup.SCISSORS && playerTwoGuess == gameSetup.PAPER))
            System.out.println("Player 1 Win");
        else {
            System.out.println("Player 2 Win");
        }
    }
}






