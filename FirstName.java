import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstName{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		String firstName;
		System.out.println("Welcome to User Registration!");
		System.out.println("Enter First Name: ");
		firstName = scanner.next();
		scanner.close();
		if (Pattern.matches("[A-Z]{1}([a-zA-Z]){2,}$", firstName)) {
			System.out.println("Valid First Name");
		}
		else {
			System.out.println("Invalid First Name");
		}
	}
}
