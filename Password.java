import java.util.Scanner;
import java.util.regex.Pattern;

public class Password{
	public static Scanner scanner = new Scanner(System.in);
	public static void toCheckEmail() {
		
	       String email;  
	       System.out.println("Enter email address: ");
	       email = scanner.next();
	       
	       if (Pattern.matches("^([0-9a-zA-Z])+([-+_])*(.)?([a-zA-Z0-9])*(@){1}[a-z]+(.){1}([a-z]{2,3}(.))*[a-z]{0,3}$", email)) {
	           System.out.println("Valid eamil address");
	       }
	       else {
	          System.out.println("Invalid email address");
	       }
	}

	public static void toCheckFirstName() {
		
	       String firstName;        
	       System.out.println("Enter First Name: ");
	       firstName = scanner.next();
	       
	       if (Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName)) {
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
	       
	       if (Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName)) {
	           System.out.println("Valid Last Name");
	       }
	       else {
	          System.out.println("Invalid Last Name");
	       }

	}
	public static void toCheckMobile() {
		String mobile;
		System.out.println("Enter mobile number");
		mobile = scanner.next();
		if (Pattern.matches("\\d{2}[\\-][1-9]{1}\\d{9}", mobile)) {
			System.out.println("Valid mobile nu1mber.");
		}
		else {
			System.out.println("Invalid mobile number.");
		}
	}
	public static void toCheckPassword() {
		String password;
		System.out.println("Enter password");
		password = scanner.next();
		if (Pattern.matches("(^(?=.*[A-Z])(?=.*[0-9])[-_.#@/]{2}([a-z]?).{8,}$", password)) {
			System.out.println("Valid password.");
		}
		else {
			System.out.println("Invalid password.");
		}
	}
    public static void main(String[] args) throws Exception {
    	toCheckFirstName();
    	toCheckLastName();
    	toCheckEmail();
    	toCheckMobile();
    	toCheckPassword();
    	scanner.close();
    }
}
