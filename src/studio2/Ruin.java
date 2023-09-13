package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How much are you starting with?");
		int startAmount = in.nextInt();
		System.out.print("How likely are you to win today?");
		double winChance = in.nextDouble();
		System.out.print("At how much money do you want to stop gambling?");
		int winLimit = in.nextInt();
		while (startAmount < winLimit && startAmount > 0)
		{
			double number = Math.random();
			if (number > (1 - winChance))
			{
				System.out.println("Win!");
				startAmount++;
			}
			else
			{
				System.out.println("Loss!");
				startAmount--;
			}
		}
		if (startAmount == winLimit)
		{
			System.out.println("Success!");
		}
		else if (startAmount == 0)
		{
			System.out.println("Ruin!");
		}

	}

}
