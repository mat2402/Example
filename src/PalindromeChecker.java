import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type your word: ");
		String word = scanner.next();
		String wordBackward = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			wordBackward += word.charAt(i);
		}
		System.out.println("Palindrome of " + word + " is " + wordBackward);

		if (word.equals(wordBackward)) {
			System.out.println(word + " is a palindrome");
		}
		else {
			System.out.println(word + " is not a palindrome");
		}
	}
}
