import java.util.*;
public class PackOfCards{
	ArrayList<Cards>packOfCards; 
    PackOfCards(){
    	packOfCards= new ArrayList<Cards>();
    	packOfCards.add(new Cards('S','A'));
    	packOfCards.add(new Cards('S','2'));
    	packOfCards.add(new Cards('S','3'));
    	packOfCards.add(new Cards('S','4'));
    	packOfCards.add(new Cards('S','5'));
    	packOfCards.add(new Cards('S','6'));
    	packOfCards.add(new Cards('S','7'));
    	packOfCards.add(new Cards('S','8'));
    	packOfCards.add(new Cards('S','9'));
    	packOfCards.add(new Cards('S','T'));
    	packOfCards.add(new Cards('S','J'));
    	packOfCards.add(new Cards('S','Q'));
    	packOfCards.add(new Cards('S','K'));
    	packOfCards.add(new Cards('H','A'));
    	packOfCards.add(new Cards('H','2'));
    	packOfCards.add(new Cards('H','3'));
    	packOfCards.add(new Cards('H','4'));
    	packOfCards.add(new Cards('H','5'));
    	packOfCards.add(new Cards('H','6'));
    	packOfCards.add(new Cards('H','7'));
    	packOfCards.add(new Cards('H','8'));
    	packOfCards.add(new Cards('H','9'));
    	packOfCards.add(new Cards('H','T'));
    	packOfCards.add(new Cards('H','J'));
    	packOfCards.add(new Cards('H','Q'));
    	packOfCards.add(new Cards('H','K'));
    	packOfCards.add(new Cards('D','A'));
    	packOfCards.add(new Cards('D','2'));
    	packOfCards.add(new Cards('D','3'));
    	packOfCards.add(new Cards('D','4'));
    	packOfCards.add(new Cards('D','5'));
    	packOfCards.add(new Cards('D','6'));
    	packOfCards.add(new Cards('D','7'));
    	packOfCards.add(new Cards('D','8'));
    	packOfCards.add(new Cards('D','9'));
    	packOfCards.add(new Cards('D','T'));
    	packOfCards.add(new Cards('D','J'));
    	packOfCards.add(new Cards('D','Q'));
    	packOfCards.add(new Cards('D','K'));
    	packOfCards.add(new Cards('C','A'));
    	packOfCards.add(new Cards('C','2'));
    	packOfCards.add(new Cards('C','3'));
    	packOfCards.add(new Cards('C','4'));
    	packOfCards.add(new Cards('C','5'));
    	packOfCards.add(new Cards('C','6'));
    	packOfCards.add(new Cards('C','7'));
    	packOfCards.add(new Cards('C','8'));
    	packOfCards.add(new Cards('C','9'));
    	packOfCards.add(new Cards('C','T'));
    	packOfCards.add(new Cards('C','J'));
    	packOfCards.add(new Cards('C','Q'));
    	packOfCards.add(new Cards('C','K'));
    	shuffle(packOfCards);
    }
	public void shuffle(ArrayList<Cards> cards){
    	
     Collections.shuffle(cards);
    }

	public Cards getFromPack() {
		return packOfCards.remove(packOfCards.size() - 1);
	}
	public void includeJoker(){
		packOfCards.add(new Cards('N','O'));
    	packOfCards.add(new Cards('N','O'));
	}
	public static void main(String as[]){
		PackOfCards dc = new PackOfCards();
	    System.out.println(dc.packOfCards);
	    
	}
}



