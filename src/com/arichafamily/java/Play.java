package com.arichafamily.java;

import java.util.Scanner;

/**
 * Created by hackeru on 20/02/2017.
 */
public class Play {
    //Properties
    Scanner in = new Scanner(System.in);
    private Deck mDeck = new Deck();
    public Hand playerHand = new Hand();
    public Hand dealerHand = new Hand();
    public String score = "";

    public Play() {
        for (int i = 0; i < 2; i++) {
            playerHand.addCard(mDeck.dealCard());
            dealerHand.addCard(mDeck.dealCard());
        }
        System.out.printf("Player Hand: %s\n", playerHand.getValue());
        System.out.printf("Dealer Hand: %s\n", dealerHand.getValue());
    }

    //Methods
    public String hitCard(){
        playerHand.addCard(mDeck.dealCard());
        System.out.printf("Player Hand: %s\n", playerHand.getValue());
        System.out.printf("Dealer Hand: %s\n", dealerHand.getValue());
        if (playerHand.getValue() == 21){
            return score = "BlackJack";
        }
        else if (playerHand.getValue() > 21){
            return score = "Busted";
        }
        return score = "";
    }

    public String stand(){
        while (dealerHand.getValue() < 17){
            dealerHand.addCard(mDeck.dealCard());
        }
        System.out.printf("Player Hand: %s\n", playerHand.getValue());
        System.out.printf("Dealer Hand: %s\n", dealerHand.getValue());

        if (dealerHand.getValue() < playerHand.getValue() || dealerHand.getValue() > 21){
            return score = "Win";
        }
        else if (dealerHand.getValue() > playerHand.getValue()){
            return score = "Loose";
        }
        else {
            return score = "Draw";
        }
    }
}
