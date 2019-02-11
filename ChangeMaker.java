package ChangeMaker;

import java.util.Scanner;

public class ChangeMaker 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Enter the amount of change due");
		System.out.println();
				
		double changeDue = input.nextDouble();
		
		System.out.println();		
		
		int numberOfDollars = numberOfDollars(changeDue);
		int numberOfQuarters = numberOfQuarters(changeDue, numberOfDollars);
		int numberOfDimes = numberOfDimes(changeDue, numberOfDollars, numberOfQuarters);
		int numberOfNickels = numberOfNickels(changeDue, numberOfDollars, numberOfQuarters, numberOfDimes);
		int numberOfPennies = numberOfPennies(changeDue, numberOfDollars, numberOfQuarters, numberOfDimes, numberOfNickels);
		
		System.out.println("Dollars: " + numberOfDollars);
		System.out.println("Quarters: " + numberOfQuarters);
		System.out.println("Dimes: " + numberOfDimes);
		System.out.println("Nickels: " + numberOfNickels);
		System.out.println("Pennies: " + numberOfPennies);
		
		input.close();
	}
	
	private static int numberOfDollars(double changeDue) 
	{		
		int dollar = 100;
		int numberOfQuarters = (int) ((changeDue*100)/dollar);
		return numberOfQuarters;		
	}	
	private static int numberOfQuarters(double changeDue, int numberOfDollars) 
	{		//******
		int dollar = 100;
		int quarter = 25;
		int numberOfQuarters = (int) (((changeDue*100)-(numberOfDollars*dollar))/quarter);
		return numberOfQuarters;		
	}
	
	private static int numberOfDimes(double changeDue, int numberOfDollars, int numberOfQuarters) 
	{		
		int dollar = 100;
		int quarter = 25;
		int dime = 10;
		int numberOfDimes = (int) (((changeDue*100)-(numberOfDollars*dollar)-(numberOfQuarters*quarter))/dime);
		return numberOfDimes;		
	}

	private static int numberOfNickels(double changeDue, int numberOfDollars, int numberOfQuarters, int numberOfDimes) 
	{		
		int dollar = 100;
		int quarter = 25;
		int dime = 10;
		int nickel = 5;		
		int numberOfNickels = (int) (((changeDue*100)-(numberOfDollars*dollar)-(numberOfQuarters*quarter)-(numberOfDimes*dime))/nickel);
				return numberOfNickels;		
	}

	private static int numberOfPennies(double changeDue, int numberOfDollars, int numberOfQuarters, int numberOfDimes, int numberOfNickels) 
	{		
		int dollar = 100;
		int quarter = 25;
		int dime = 10;
		int nickel = 5;		
		int numberOfPennies = (int) (((changeDue*100)-(numberOfDollars*dollar)-(numberOfQuarters*quarter)-(numberOfDimes*dime)-(numberOfNickels*nickel)));
		return numberOfPennies;		
	}
}