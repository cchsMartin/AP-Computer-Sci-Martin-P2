import java.util.Random;

//Connor & Nick worked together to create this masterpiece.

public class DiceObject {
	private int sides;
	
	Random random = new Random();
	
	public DiceObject() {
		sides = 20;
	}
	
	public void roll() {
		int randomRoll = random.nextInt(sides) + 1;
		System.out.println("You rolled a " + randomRoll);
	}
	
	
	
	
	
	
	
	
	
	
}
