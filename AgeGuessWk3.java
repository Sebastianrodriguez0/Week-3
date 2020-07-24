import java.util.*;

public class AgeGuessWk3 {

	public static void main(String[] args) {
		String name;
		int ageGuess, age;
		Random gen = new Random();
		age = gen.nextInt(101);
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter name: ");
		name = scan.nextLine();
		System.out.print("Guess age: ");
		ageGuess = scan.nextInt();
		System.out.println("Your guess is: " + ageGuess);
		System.out.println("Correct answer: " + age);

		if (ageGuess != age) {
			System.out.print("You guessed wrong! ");
		}
			if (ageGuess > age) {

		}
			while (ageGuess != age) {
				System.out.println("Keep guessing!");
				ageGuess = scan.nextInt();

		}
			if (ageGuess == age) {
				System.out.println("Correct!");
		}
	}

}
