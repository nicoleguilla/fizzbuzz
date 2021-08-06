package fizzbuzzJava;

import java.util.Scanner;

public class FizzBuzzJava {
    public static void fizzbuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int n;
        System.out.println("Please, enter a number:");
        n = scanner.nextInt();
        fizzbuzz(n);
    }
}
