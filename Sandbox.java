package RockPaperScissors;

public class Sandbox {

    public static void main(String[] args){

        Players playerName1 = new Players("Andre");
        Players playerName2 = new Players("Fabio");
        System.out.println("Entering in the ring, we got " + playerName1.giveMeYourPlayerName() + " vs " + playerName2.giveMeYourPlayerName());



        System.out.println(playerName1.giveMeYourPlayerName() + " got " + playerName1.playerOneGuess + " and " + playerName2.giveMeYourPlayerName() + " got " + playerName2.playerTwoGuess );
        boolean matchGame = false;
        System.out.println(matchGame);


    }
}
