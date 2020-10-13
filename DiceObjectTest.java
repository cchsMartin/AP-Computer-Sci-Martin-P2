
public class DiceObjectTest {

	public static void main(String[] args) {
		int count = 0;
		DiceObject roll = new DiceObject();
		
		while(count <20) {
			roll.roll();
			count++;
		}
		
		
	}
}
