package Github;
import java.util.Scanner;  
class PrimeException extends Exception {
    PrimeException(String s) {
        super(s);
    }
}

class Main {
    static boolean isPrime(int num) throws PrimeException {
        /*if (num < 2) {
            throw new PrimeException("Number is less than 2.");
        }
*/
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int num = sc.nextInt();

        try {
            boolean result = isPrime(num);
            if (result) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        } catch (PrimeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("End of program.");
        }
    }
}

