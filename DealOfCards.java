import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrangeCards {
	int LifeCount;
	public boolean dealOrNoDeal(ArrayList<Card> HandOfCards) {
		int ClubCount, DiamondCount, HeartCount, SpadeCount;
		ArrayList<Integer> Clubs = new ArrayList<Integer>();
		ArrayList<Integer> Diamonds = new ArrayList<Integer>();
		ArrayList<Integer> Hearts = new ArrayList<Integer>();
		ArrayList<Integer> Spades = new ArrayList<Integer>();
		for (Card obj : HandOfCards) {
			if (obj.suite == 'C') {
				Clubs.add(obj.getPip());
			}
			if (obj.suite == 'D') {
				Diamonds.add(obj.getPip());
			}
			if (obj.suite == 'H') {
				Hearts.add(obj.getPip());
			}
			if (obj.suite == 'S') {
				Spades.add(obj.getPip());
			}
		}
		Collections.sort(Clubs);
		Collections.sort(Diamonds);
		Collections.sort(Hearts);
		Collections.sort(Spades);
		sequenceInHand(Clubs);
		sequenceInHand(Diamonds);
		sequenceInHand(Hearts);
		sequenceInHand(Spades);
				return false;

	}

	public void sequenceInHand(ArrayList<Integer> CardsInHand) {
		
		for (int i = 0; i < CardsInHand.size(); i++) {
			int count = 0;
			for (int j = i; j < i + 4 && i < 9; j++) {
				int curr = CardsInHand.get(j);
				if (curr + 1 == CardsInHand.get(j + 1)) {
					count++;
				} else {
					break;
				}
			}
			if(count >= 3){
				LifeCount++;
			}
			continue;
			}
	
}
	public static void main(String args[]) {
		ArrangeCards agg = new ArrangeCards();
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
		agg.sequenceInHand(CardsOfPlayer);
		System.out.println(agg.LifeCount);
		
	}

}

