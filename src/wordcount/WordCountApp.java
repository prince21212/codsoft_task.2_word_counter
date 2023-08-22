package wordcount;
import java.util.Scanner;


public class WordCountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.println("Enter a text or provide a file to count the words:");
        String input = scanner.nextLine();

        // Step 2: Split the input into words
        String[] words = input.split("\\s+|\\p{Punct}");

        // Step 4: Initialize a counter variable
        int wordCount = 0;

        // Step 5: Count the words
        for (String word : words) {
            if (!word.isEmpty()) { // Check for empty strings
                wordCount++;
            }
        }

        // Step 6: Display the total word count
        System.out.println("Total word count: " + wordCount);

        scanner.close();
    }
}
