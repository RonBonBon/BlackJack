package com.arichafamily.java;

import java.util.ArrayList;

/**
 * Created by hackeru on 20/02/2017.
 */
public class Deck {
    //Properties
    private ArrayList<BlackJackCard> cards = new ArrayList<>();

    //Constructor
    public Deck() {
        String[] suits = {"♥", "♦", "♣", "♠"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (String s : suits) {
            for (String r : ranks) {
                BlackJackCard c = new BlackJackCard(s, r);
                cards.add(c);
            }
        }
        shuffle();
    }

    //Methods
    public void shuffle() {
        ArrayList<BlackJackCard> shuffled = new ArrayList<>();
        while (cards.size() > 0) {
            int randIndex = RandomUtils.getInt(0, cards.size() - 1);
            BlackJackCard tempCard = cards.remove(randIndex);
            shuffled.add(tempCard);
        }
        cards = shuffled;
    }

    public BlackJackCard dealCard() {
        return cards.remove(0);
    }

    @Override
    public String toString() {
        return cards.toString();
    }

    public int size(){
        return cards.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }
}
