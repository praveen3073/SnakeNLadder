
public class snakenladder {
	public static void main(String args[]){
		System.out.println("Welcome to Snake & Ladder Simulator");
		final int START_POSITION = 0;
		int position = START_POSITION;
		int dieNumber = (int) Math.floor(Math.random()*60)%6 + 1;
		System.out.println("The number on the die is: " + dieNumber);
	}
}
