public class largest_prime_factor {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findLargestPrimeFactor(long num) {
        int largestPrime = 2; // Initialize with smallest prime (2)

        // Efficiently iterate only up to the square root of the number
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // If i is a factor
                largestPrime = (int) Math.max(largestPrime, (isPrime((int) i) ? i : findLargestPrimeFactor(num / i))); // Check for primality
            }
        }

        return largestPrime;
    }

    public static void main(String[] args) {
        long number = 600851475143L; // Handle large numbers using long
        int largestPrimeFactor = findLargestPrimeFactor(number);
        System.out.println("The largest prime factor of " + number + " is: " + largestPrimeFactor);
    }
}
