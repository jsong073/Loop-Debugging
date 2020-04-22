import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";
        System.out.print("Enter a word or type \"stop\" to stop: ");
        userInput = keyboard.nextLine();

        while (!userInput.equalsIgnoreCase("stop")) {
            System.out.println(userInput);
            System.out.print("Enter another word or stop: ");
            userInput = keyboard.nextLine();
        }

        System.out.println("Goodbye.");

    }
}