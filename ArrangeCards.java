import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrangeCards {
	public boolean dealOrNoDeal(ArrayList<Card> HandOfCards) {
		int ClubCount,DiamondCount,HeartCount,SpadeCount;
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
		 if(Clubs.size() > 3) {
			 ClubCount = sequenceInHand(Clubs);
		 }
		 if(Diamonds.size() > 3) {
			 DiamondCount = sequenceInHand(Diamonds);

		 }
		 if(Hearts.size() > 3) {
			 HeartCount = sequenceInHand(Hearts);
		 }
		 if(Spades.size() > 3) {
			 SpadeCount = sequenceInHand(Spades);
		 }
		return false;

	}
	public int sequenceInHand(ArrayList<Integer> CardsInHand) {
		int count = 0;
		for(int i=0; i<CardsInHand.size(); i++){
            int curr = CardsInHand.get(i);
            if (curr + 1 == CardsInHand.get(i + 1)){
            	count++;
            }
        }
		return count;
	}
	
}

