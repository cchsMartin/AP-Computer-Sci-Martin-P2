import java.util.Scanner;
/**
 * Author Connor Horstman
 * Date: Sep 28, 2020
 * Description: This program takes input data and turns it into an email and password."
 */
public class EmailAddress {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //creates a scanner capable of user input
		System.out.println("What is your first name?");
		String firstName = keyboard.nextLine(); //nextLine() gathers the next string typed to the console
		System.out.println("What is your middle name?");
		String middleName = keyboard.nextLine();
		System.out.println("What is your last name?");
		String lastName = keyboard.nextLine();
		System.out.println("Please type your birtday (mm-dd-yyyy)");
		String birthday = keyboard.nextLine();
		//System.out.println(birthday + ' ' + firstName + ' ' + middleName + " " + lastName); This was a check to see if variables displayed correctly
		String firstInitial = firstName.substring(0,1); //Grabs the first letter of the input first name
		String middleInitial = middleName.substring(0,1); //Grabs the first letter of the input middle name
		System.out.println("Email: " + lastName.toLowerCase() + firstInitial.toUpperCase() + middleInitial.toUpperCase() + "@sharkmail.com" + "\nTemp Password: " + birthday.substring(0,2) + birthday.substring(3,5) + birthday.substring(6)); //uses string methods to keep a consistent output no matter what was input. uses an escape character to keep two lines in one, for no other reason than to try it out
		System.out.println("*** Notice: This password is very insecure. Please change it immediately! ***");
	}

}
