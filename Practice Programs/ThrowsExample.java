package exceptions;

public class ThrowsExample {

	    // 1. The method uses 'throws' to warn that it might throw an exception
	    public static void validateAge(int age) throws Exception{
	        if (age < 18) {
	            // Using 'throw' to trigger the exception if the rule is broken
	            throw new Exception("Access Denied: You must be at least 18 years old.");
	        }
	        
	        System.out.println("Access Granted: Welcome to the system!");
	    }

	    public static void main(String[] args) {
	        // 2. Because validateAge declares 'throws Exception', the caller MUST handle it
	        try {
	            validateAge(20); // This will fail the check
	        } catch (Exception e) {
	            // 3. The error is safely caught and managed here in the main method
	            System.out.println("Caught an error in main: " + e.getMessage());
	        }
	        
	        System.out.println("The program continues to run safely...");
	    }

}
