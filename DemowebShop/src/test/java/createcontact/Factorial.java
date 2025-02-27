package createcontact;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
	
	public static void main(String[] args) {
		
		

	   
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        scanner.close();
	        
	        System.out.println("Factorial of " + num + " is: " + factorial(num));
	        System.out.println("Factorial of " + num + " is: " + factorial(num));
	    //hi
		
	}

}
