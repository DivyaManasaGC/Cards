import java.util.HashMap;


public class Compare2 {
	public boolean isGreater(Cards obj) {
		Map<Character , Integer> SuitValue = new HashMap<Character,Integer>();
		SuitValue.put('C',1);
		SuitValue.put('D',1);
		SuitValue.put('H',1);
		SuitValue.put('S',1);
		if(this.getPip() == obj.getPip()){
			return (SuitValue.get(this.suite) > SuitValue.get(obj.suite));
		}else{
			return (this.getPip() > obj.getPip());
		}
	}
}

