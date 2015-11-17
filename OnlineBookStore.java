//*******************************************************************
//Assignment #1
//Part 2
//
//OnlineBookStore.java By: Luis Saravia Patron ID # 6800505
//
//This program asks the user for the amount that he/she will pay, 
//then displays a message indicating how many e-books the user will
//be able to purchase as well as how much funds will remain in the
//account after that. 
//*******************************************************************



import java.util.Scanner; // I must import this class in order to use it later.

public class OnlineBookStore {

	
	//I assumed that the user will always enter a valid integer value that is >= 0, and within the limit of the integer range./**
	
	public static void main(String[] args) {
		
		//Welcome message
		System.out.println("Assignment1 Part2 - Online Bookstore -  written by Luis Saravia Patron.");
		System.out.println();
		
		//Constant and Variables naming.
		final int PRICE = 9; // I named it as a constant as it is a given fixed value.
		int newAmount, availableEbooks, finalBalance;
		
		//Creating one scanner object
		Scanner uI = new Scanner(System.in); // uI is for User Input
		
		//Displaying output to user.
		System.out.println("Welcome to On-line Bookstore!");
		System.out.println("Please enter the amount you want to prepay.");
		
		//Obtaining input from user.
		newAmount = uI.nextInt();
		
		//Processing obtained information
		availableEbooks = newAmount / PRICE; // Casting is not needed here as we assume that only integers values will be entered.
		finalBalance = newAmount % PRICE; //  Remainder from the 2 integer division is obtained here.
		
		//Displaying results to user
		System.out.print("With this amount you will be able to purchase " + availableEbooks + " e-books.");
		System.out.println("Then you will have " + finalBalance + "$ left as a credit in your account");
		
		//End message
		System.out.println("Thank you! \nEnd of program.");
		
	}

}
//Saved and compiled the program MyFirstProgram.java using Eclipse IDE

//The result of compiling & running the program
/* Welcome to On-line Bookstore!
Please enter the amount you want to prepay.
15
With this amount you will be able to purchase 1 e-books.Then you will have 6$ left as a credit in your account
Thank you! 
End of program.
 */

