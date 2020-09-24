
public class snakenladder {
	public static void main(String args[]){
		System.out.println("Welcome to Snake & Ladder Simulator");
		final int START_POSITION = 0;
		int position = START_POSITION;
		int positionChange = 0;
		while(position!=100)
		{
			int dieNumber = (int) Math.floor(Math.random()*60)%6 + 1;
			System.out.println("The number on the die is: " + dieNumber);
			int playOption = (int) Math.floor(Math.random()*60)%3;
			if(playOption==0)
				positionChange = 0;
			else if(playOption==1)
				positionChange = dieNumber;
			else
				positionChange = -1*dieNumber;
			position += positionChange;
			if(position<0)
				position=0;
			if(position>100)
				position -= positionChange;
			System.out.println(position);
		}
	}
}
