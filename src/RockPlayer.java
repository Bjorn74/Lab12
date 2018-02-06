
public class RockPlayer extends Player {

	// Instance variables
	final int roshamboValue = 0; // Overrides Player
	final String name = "Rocky";

	@Override
	public int getRoshamboValue() {
		return this.roshamboValue;
	}

	@Override
	public String toString() {

		return "Rocky chooses rock.";
	}

}
