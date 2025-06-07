package assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text (type 'stop' to exit): ");

        Counter textCounter = new Counter();
        String text = scanner.nextLine();
        textCounter.addText(text);


        while (!textCounter.isStop()) { // om det är inte stop "--=+"; while(true) kör loopen om och om igen tills stopp-signal ges
            text = scanner.nextLine();  // läser in text från användaren
            textCounter.addText(text);  // lägger till texten i textCounter
        }

        System.out.println("Antal rader: " + textCounter.getRowCounter());
        System.out.println("Antal tecken: " + textCounter.getCharacterCounter());
        System.out.println("Antal ord: " + textCounter.getWordCounter());
        System.out.println("Längsta ord: " + textCounter.getLongestWord());
    }
}

