public class SumOfDigits {

    // Helper method to check if a number is a single digit (0–9)
    public static boolean isSingleDigit(int n){
        return n <= 9;
    }

    // Calculates the digital root of a number.
    // The digital root is obtained by repeatedly summing the digits of the number
    // until a single-digit result is produced.
    public static int digital_root(int n){
        int sum = 0;

        // Loop to sum the digits of the number until only one digit remains
        while(!isSingleDigit(n)){
            sum += (n % 10);  // Add the last digit of n to sum
            n /= 10;          // Remove the last digit from n
        }
        sum += (n % 10);      // Add the final digit after loop ends

        // If the resulting sum is still not a single digit, apply the method recursively
        if(!isSingleDigit(sum)){
            return digital_root(sum); // Recursively compute digital root
        }

        return sum; // Final single-digit result
    }

    public static void main(String[] args) {
        int n = 942;
        System.out.println(digital_root(n)); // Output: 6
    }
}

// Digital Root Explanation:
// The digital root is the recursive sum of all the digits in a number.
// For example: 942 → 9+4+2 = 15 → 1+5 = 6
// Input is assumed to be a non-negative integer.
