import java.util.Random;
import java.util.Scanner;


public class RiffleShuffle2 {
	
	private static int[] RiffleShuffle(int[] deck, int n) {
		int[] temp1 = new int[deck.length / 2];
		int[] temp2 = new int[deck.length / 2];
		for (int i = 0; i < temp1.length; i++) {
			temp1[i] = deck[i];
			temp2[i] = deck[i + 26];
		}
		if(n == 0) {
			return deck;
		}else if(n == 1){
			return Riffle(temp1, temp2);
		} else {
			return RiffleShuffle(Riffle(temp1, temp2), n-1);
		}

	}

	private static int[] Riffle(int[] deck1, int[] deck2) {
		int[] fDeck = new int[deck1.length * 2];
		int deckOneCount = 0;
		int deckTwoCount = 0;
		Random rand = new Random(); 
		int value = rand.nextInt(50); 
		if(value < 26){
		for (int i = 0; i < fDeck.length; i++) {
				if(i == 0 || i % 2 == 0){
					fDeck[i] = deck1[deckOneCount];
					deckOneCount++;
				}else {
					fDeck[i] = deck2[deckTwoCount];
					deckTwoCount++;
				}
			}
		} else {
			for (int i = 0; i < fDeck.length; i++) {
				if(i == 0 || i % 2 == 0){
					fDeck[i] = deck2[deckTwoCount];
					deckTwoCount++;
				}else {
					fDeck[i] = deck1[deckOneCount];
					deckOneCount++;
				}
			}
		} 
		return fDeck;
	}

	private static void printDeck(int[] deck) {
		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i]);
		}
	}

	public static void main(String[] args) {
		int[] deck = new int[52];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i + 1;
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("Choose number of shuffles(for better randomness input atleast 12): ");
		int n = input.nextInt();
	    System.out.println();
	    deck = RiffleShuffle(deck,n); 

	    printDeck(deck);


	}
}
