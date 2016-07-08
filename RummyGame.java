import java.util.ArrayList;


public class RummyGame {
	int PlayersCount;
    	HandsInGame[] Players;
	int InHandCount = 13;

	public RummyGame (int Participants) {
		PlayersCount = Participants;
		Players = new HandsInGame[PlayersCount];
		DeckOfCards TotalCards = new DeckOfCards();int InHandCount = 13;
		for(int j = 0;j < PlayersCount;j++){
			ArrayList<Card> Players = new ArrayList<Card>();
		    for(int i = 0;i< InHandCount;i++) {
		    	Players.add(getNextCard());
		    }
		}
		
	}
}


