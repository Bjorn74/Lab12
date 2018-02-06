import java.util.Scanner;

public class UserPlayer extends Player {

	Scanner scan = new Scanner(System.in);
	
	// Instance Variables
	String name;
	int roshamboValue;
	
	@Override
	public int getRoshamboValue() {
		// TODO Auto-generated method stub
		return this.roshamboValue;
	}
	
	public void setRoshamboValue() {
		char weapon = Validator.getChar(scan, "Select your weapon:\n(R)ock, (P)aper, (S)cissors, (L)izard, or Sp(o)ck.");
		switch (weapon) {
		case 'r':
			this.roshamboValue = 0;
			break;
		case 'p':
			this.roshamboValue = 1;
			break;
		case 's':
			this.roshamboValue = 2;
			break;
		case 'l':
		case '1':
			this.roshamboValue = 3;
			break;
		case 'o':
		case '0':
			this.roshamboValue = 4;
			break;
		default:
			this.roshamboValue = 0;
			System.out.println("Invalid Choice. You get a rock.");
			break;
		
		}
		
	}

	@Override
	public String toString() {
		Roshambo[] choices = Roshambo.values();
		String choice = choices[this.getRoshamboValue()].toString();
		return ("You chose " + choice + ".");
	}

}
