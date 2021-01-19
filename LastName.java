
import java.util.Scanner;
import java.util.regex.Pattern;

public class LastName {
	public static Scanner scanner = new Scanner(System.in);
	public static void toCheckFirstName() {
		
	       String firstName;        
	       System.out.println("Enter First Name: ");
	       firstName = scanner.next();
	       
	       if (Pattern.matches("[A-Z]{1}[a-zA-Z]{2,}$", firstName)) {
	           System.out.println("Valid First Name");
	       }
	       else {
	          System.out.println("Invalid First Name");
	       }
	       
	}
	public static void toCheckLastName() {
		
	       String lastName;        
	       System.out.println("Enter Last Name: ");
	       lastName = scanner.next();
	       
	       if (Pattern.matches("[A-Z]{1}[a-zA-Z]{2,}$", lastName)) {
	           System.out.println("Valid Last Name");
	       }
	       else {
	          System.out.println("Invalid Last Name");
	       }
	       
	}
	public static void main(String[] args) {
		
	   	toCheckFirstName();
    	toCheckLastName();
    	scanner.close();
    	
	}
}
