package createcontact;

import java.util.Scanner;

public class PrimeNumber {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        boolean isPrime = true;
        
        if (num < 2) isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                
            }
            
        }
		
	}

}
