package com.onebill.ty.assignment.day2;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			char randomCharacter=(char) (rand.nextInt(26)+'a');
			System.out.println("Enter Your Character : ");
			char userCharacter=scan.next().charAt(0);
			if(randomCharacter!=userCharacter)
			{
				System.out.println("Wrong the Character is "+randomCharacter);
			}
			else if(randomCharacter==userCharacter)
			{
				System.out.println("Win..!");
				break;
			}
			System.out.println("Are you leave this game please enter 0 else 1 ");
			int breakKeyValue=scan.nextInt();
			if(breakKeyValue==0)
			{
				System.out.println("Thankyou ...!");
				break;
			}	
		}
	}

}
