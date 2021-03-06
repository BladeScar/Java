package com.gpProject;

import java.util.Random;

public class Deck {
	private static Card[] newDeck;

	Card.Rank[] ranks = Card.Rank.values();
	Card.Suit[] suits = Card.Suit.values();

	public Deck(int n) {
		newDeck = new Card[n];
		int count = 0;
		for (Card.Suit suit : suits) {
			for (Card.Rank rank : ranks) {

				newDeck[count] = new Card(rank, suit);
				count++;
			}

		}
	}

	public void printDeck() {
		for (int i = 0; i < newDeck.length; i++) {
			System.out.println((i + 1) + ": " + newDeck[i]);
		}
	}

	public void RiffleShuffle(int n) {

		Card[] temp1 = new Card[newDeck.length / 2];
		Card[] temp2 = new Card[newDeck.length / 2];
		for (int i = 0; i < temp1.length; i++) {
			temp1[i] = (Card) newDeck[i];
			temp2[i] = (Card) newDeck[i + 26];
		}
		if(n == 0) {
			return;
		} else if(n == 1){
			Shuffling(temp1, temp2);
		} else if (n < 0) {
			System.out.println("You can't have a negative amount of shuffles!");
		} else {
			Shuffling(temp1, temp2);
			RiffleShuffle(n-1);
		}
					
	}

	public static void Shuffling(Card[] deck1, Card[] deck2) {

		int deckOneCount = 0;
		int deckTwoCount = 0;
		Random rand = new Random();
		int value = rand.nextInt(50);

		if (value < 26) {
			for (int i = 0; i < newDeck.length; i++) {
				if (i == 0 || i % 2 == 0) {
					newDeck[i] = deck1[deckOneCount];
					deckOneCount++;
				} else {
					newDeck[i] = deck2[deckTwoCount];
					deckTwoCount++;
				}
			}

		} else {
			for (int i = 0; i < newDeck.length; i++) {
				if (i == 0 || i % 2 == 0) {
					newDeck[i] = deck2[deckTwoCount];
					deckTwoCount++;
				} else {
					newDeck[i] = deck1[deckOneCount];
					deckOneCount++;
				}
			}

		}
	}

}
