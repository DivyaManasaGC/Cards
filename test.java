
public class testCard {
	public static void main(String args[]) {
		Cards first = new Cards('s','8');
		Cards second = new Cards('k','8');
		System.out.println(first.isGreater(second));
	}
}
