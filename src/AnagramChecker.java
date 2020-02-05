import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("   ");
		System.out.println("   ");
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("First word: ");
		String firstWord = scanner.next();

		System.out.println("Second word: ");
		String secondWord = scanner.next();

		char[] word1 = firstWord.toCharArray();
		char[] word2 = secondWord.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);

		if (Arrays.equals(word1, word2)) {
			System.out.println("These words are anagrams");
		}
		else {
			System.out.println("These words are not anagrams");
		}

	}
}
