package studio2;
import java.util.Scanner;
public class Ruin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How much are you starting with? ");
		int startAmount = in.nextInt();
		System.out.print("How likely are you to win today? ");
		double winChance = in.nextDouble();
		System.out.print("At how much money do you want to stop gambling? ");
		int winLimit = in.nextInt();
		System.out.print("How many days do you want to play? ");
		int totalSimulations = in.nextInt();
		
		for (int count = 1; count <= totalSimulations; count++) {
			
			int newStartAmount = startAmount;
			for (int play = 1; newStartAmount < winLimit && newStartAmount > 0; play++)
			{
				double number = Math.random();
				
				if (number > (1 - winChance))
				{
					// System.out.print("Win!");
					newStartAmount++;
				}
				
				else
				{
					// System.out.println("Loss!");
					newStartAmount--;
				}
				if (newStartAmount == winLimit){
					System.out.println("Simulation: " + count + " " + play + " Success");
				}
				
				else if (newStartAmount == 0)
				{
					System.out.println("Simulation: " + count + " " + play + " Ruin");
				}
			}
		}
	}
}