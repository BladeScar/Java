package com.gpProject;


public class Card {
    public enum Suit { HEARTS, CLUBS, DIAMONDS, SPADES; }

    public enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
                       NINE, TEN, JACK, QUEEN, KING, ACE; }

    final Rank rank;
    final Suit suit;
    
    @Override
    public String toString(){
        return rank.name() + " of " + suit.name();
    }


    
    public Card (final Rank rank, final Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
}
