import java.util.Random;

public class RandomPlayer extends Player {

	// Instance variables
	String name;
	int roshamboValue = 0;
	
	
	@Override
	public int getRoshamboValue() {
		return this.roshamboValue;
	}
	
	public void setRoshamboValue() {
		Random random = new Random();
		int setNum = random.nextInt(5);
		this.roshamboValue = setNum;
	}
	
	public void giveName() {
		Random random = new Random();
		String[] names = {"Leonard Hofstadter", "Sheldon Cooper", "Penny", "Howard Wolowitz", "Rajesh Koothrappali", "Leslie Winkle", "Bernadette Rostenkowski-Wolowitz", "Amy Farrah Fowler"};
		this.name = names[random.nextInt(7)];
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		Roshambo[] choices = Roshambo.values();
		String choice = choices[roshamboValue].toString();
		return (this.name + " chose " + choice + ".");
	}
	
	

}
