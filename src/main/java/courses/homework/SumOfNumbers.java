package courses.homework;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of the first 100 numbers greater than 0 is: " + sum);
    }
}
