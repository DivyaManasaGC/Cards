
import java.util.*;

public class Rummy {
	Player[] players;
	int noOfPlayers;
	int lifeCount;

	Rummy(int n) {
		players = new Player[n];
		noOfPlayers = n;
	}

	public void distribute() {
		int noOfPacks = 0;
		if(noOfPlayers == 2){
			noOfPacks = 1;
		}
		else if (noOfPlayers >= 2 && noOfPlayers <= 3) {
			noOfPacks = 2;
		} else if (noOfPlayers >= 4 && noOfPlayers <= 6) {
			noOfPacks = 3;

		}
		PackOfCards[] pack = new PackOfCards[noOfPacks];
		Cards card;
		int i = 0;
		for (int k = 0; k < 3; k++) {
			pack[k].includeJoker();
			pack[k].shuffle(pack[k].packOfCards);
		}
		for (int k = 0; k < 13; k++) {
			if (pack[i].packOfCards.size() > 0) {
				for (int j = 0; j < noOfPlayers; j++) {
					card = pack[i].getFromPack();
					players[j] = new Player(card.suit, card.pip);
				}
			} else {
				i++;
			}
		}
	}

	public boolean isDeclare(ArrayList<Cards> HandOfCards) {
		ArrayList<Integer> Clubs = new ArrayList<Integer>();
		ArrayList<Integer> Diamonds = new ArrayList<Integer>();
		ArrayList<Integer> Hearts = new ArrayList<Integer>();
		ArrayList<Integer> Spades = new ArrayList<Integer>();
		ArrayList<Integer> Jokers = new ArrayList<Integer>();
		for (Cards obj : HandOfCards) {
			if (obj.suit == 'C') {
				Clubs.add(obj.getPip());
			} else if (obj.suit == 'D') {
				Diamonds.add(obj.getPip());
			} else if (obj.suit == 'H') {
				Hearts.add(obj.getPip());
			} else if (obj.suit == 'S') {
				Spades.add(obj.getPip());
			} else {
				Jokers.add(obj.getPip());
			}
		}
		Collections.sort(Clubs);
		Collections.sort(Diamonds);
		Collections.sort(Hearts);
		Collections.sort(Spades);
		lifeCount(Clubs);
		lifeCount(Diamonds);
		lifeCount(Hearts);
		lifeCount(Spades);
		return true;

	}

	public void lifeCount(ArrayList<Integer> CardsInHand) {

		for (int i = 0; i < CardsInHand.size();i++) {
			int count = 0;
			for (int j = i; j < i + 4 && i < 9; j++) {
				int curr = CardsInHand.get(j);
				if (curr + 1 == CardsInHand.get(j + 1)) {
					count++;
					if (count == 3) {
						lifeCount++;
					}
				} else {
					break;
				}
			}

		}

	}
	public static void main(String args[]) {
		Rummy rm= new Rummy(2);
		ArrayList<Integer> CardsOfPlayer = new ArrayList<Integer>();
		CardsOfPlayer.add(1);
		CardsOfPlayer.add(2);
		CardsOfPlayer.add(3);
		CardsOfPlayer.add(4);
		CardsOfPlayer.add(5);
		CardsOfPlayer.add(6);
		CardsOfPlayer.add(7);
		CardsOfPlayer.add(8);
		CardsOfPlayer.add(9);
		CardsOfPlayer.add(10);
		CardsOfPlayer.add(11);
		CardsOfPlayer.add(12);
		CardsOfPlayer.add(13);
		Collections.sort(CardsOfPlayer);
		rm.lifeCount(CardsOfPlayer);
		System.out.println(rm.lifeCount);
		
		
	}
}

