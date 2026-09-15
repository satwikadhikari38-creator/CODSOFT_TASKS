import java.util.Scanner;
import java.util.Random;

public class numbergame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generate random number between 1 and 100
        int number = random.nextInt(100) + 1;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        int guess;

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high! Try again.");
            }
            else if (guess < number) {
                System.out.println("Too low! Try again.");
            }
            else {
                System.out.println("Congratulations! You guessed the correct number.");
            }

        } while (guess != number);

        sc.close();
    }
}