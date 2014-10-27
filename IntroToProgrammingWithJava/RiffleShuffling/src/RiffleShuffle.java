
public class RiffleShuffle {
	private static int[] RiffleShuffle(int[] deck){
		int[] fDeck = new int[52];
		int[] temp1 = new int[deck.length/2];
		int[] temp2 = new int[deck.length/2];
		
		for(int i = 0; i < temp1.length; i++){
			temp1[i] = deck[i];
			temp2[i] = deck[i+26];
		}

		
		 return Riffle(temp1, temp2);


	/*
	private static void printRiffleShuffle(int[] deck){
		int[] fDeck = new int[52];
		int[] temp1 = new int[deck.length/2];
		int[] temp2 = new int[deck.length/2];
		
		for(int i = 0; i < temp1.length; i++){
			temp1[i] = deck[i];
			System.out.printf("temp1: %d and deck: %d", temp1[i], deck[i]);
			System.out.println();
			temp2[i] = deck[i+26];
			System.out.printf("temp2: %d and deck: %d", temp2[i], deck[i+26]);
			System.out.println();
		}
*/
	}
	
	private static int[] Riffle(int[] deck1, int[] deck2){
		int[] fDeck = new int[deck1.length * 2];
		for(int i = 0; i < fDeck.length; i = i + 2) {
			for(int j = 0; j < deck1.length; j++) {
				fDeck[i] = deck1[j];
				fDeck[i+1] = deck2[j];
			}
		}
		
		return fDeck;
	}
	
	private static void printDeck(int[] deck) {
		for(int i = 0; i < deck.length; i++) {
			System.out.println(deck[i]);
		}
	}
	
	public static void main(String[] args){
	    int[] deck = new int[52];
		for(int i = 0; i < deck.length;i++) {
			deck[i] = i + 1;
			System.out.print(deck[i] + " ");
		}
		int[] newDeck = new int[deck.length * 2];
		printDeck(deck);
		newDeck = Riffle(deck, deck);
		//printRiffleShuffle(deck);
		/*
		deck = RiffleShuffle(deck);
		printDeck(deck);*/
		printDeck(newDeck);
	}
	
}
