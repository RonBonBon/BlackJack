package com.arichafamily.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Play game = new Play();
        if (game.playerHand.getValue() == 21)
            System.out.println("BlackJack");
        else if (game.dealerHand.getValue() == 21){
            System.out.println("Loose");
        }
        else {
            while (game.score.equals("")) {
                int hit = IO.getInt("Player: Hit or Stand (1-2):\n" +
                        "1) Hit\n" +
                        "2) Stand\n", 1, 2);
                if (hit == 1) {
                    game.hitCard();
                } else {
                    game.stand();
                }
            }
            System.out.println(game.score);
        }
    }
}
