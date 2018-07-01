import java.util.Scanner;

public class App {

	// Input a string from the user. Analyse the text to count the words in the
	// text, and display the result.

	public static void main(String[] args) {

		String info;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter some words, and I will count the number of words");

		info = sc.nextLine();

		int wordCount = 1;

		for (int i = 0; i < info.length(); i++) {
			if (info.charAt(i) == ' ') {
				wordCount++;
			}
		}

		System.out.println("Word count is = " + wordCount);
	}

}
