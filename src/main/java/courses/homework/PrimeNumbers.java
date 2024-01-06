package courses.homework;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i < 1000000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
