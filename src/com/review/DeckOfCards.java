package com.review;

public class DeckOfCards {
    public static void settingDeck() {
        //initialising the suits of the deck in a String array named 'SUITS'
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

        //initialising the ranks of the deck in a String array named 'RANKS'
        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        // initialize deck
        int totalCards = SUITS.length * RANKS.length; //
        String[] deck = new String[totalCards];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }
    }
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        settingDeck();
    }
}

