import java.util.*;
public class Cards {
	 char pip;
	 char suite;
	  Cards(char suite,char pip){
	       this.pip = Character.toUpperCase(pip);
	       this.suite = suite; 
	  }
	  private int getPip(){
	       Map<Character,Integer> pipMap = new HashMap<Character,Integer>();
	       pipMap.put('A',1);
	       pipMap.put('2',2);
	       pipMap.put('3',3);
	       pipMap.put('4',4);
	       pipMap.put('5',5);
	       pipMap.put('6',6);
	       pipMap.put('7',7);
	       pipMap.put('8',8);
	       pipMap.put('9',9);
	       pipMap.put('T',10);
	       pipMap.put('J',11);
	       pipMap.put('Q',12);
	       pipMap.put('K',13);
	       return pipMap.get(this.pip);
	  }
	 public  String toString(){
		  return this.suite + ""+this.pip;
	  }
}
