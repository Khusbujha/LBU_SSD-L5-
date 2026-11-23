import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Driver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Prompt user for text
        System.out.println("Enter a text:");
        String userInput = sc.nextLine();

        //Using WordProcessor as the data type (required to access setText)
        WordProcessor wp = new WordProcessor();
        wp.setText("Default");

        //Stores both test cases in an array
        String[] testInputs = {userInput, wp.getText()};
        //Tests with both user input and null value(triggers fallback text)
        for (String input : testInputs) {
            if (input != null) {
                System.out.println("\n--- Testing with User Input ---");
            } else {
                System.out.println("\n--- Testing with Null (Fallback) ---");
            }
            System.out.println(input);
            System.out.println("Word count: " + wp.countWords(input));
            System.out.println("Letter count: " + wp.countLetters(input));
            System.out.println("Total Length: " + wp.getLength(input));
        }
        sc.close();
    }
}