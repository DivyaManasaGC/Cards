import java.util.*;
public class Player {
  ArrayList<Cards>inHand = new ArrayList<Cards>();
  Player(char pip,char suit){
	  inHand.add(new Cards(pip,suit));
  }
  public void pickCard(){
	  PackOfCards pack = new PackOfCards();
	   inHand.add(pack.getFromPack());
  }
  public Cards dropCard(int i){
	  return inHand.remove(i);
  }
}
