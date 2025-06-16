package assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text (type 'stop' to exit): ");

        Counter textCounter = new Counter();  //Skapar ett objekt Counter och ger det namnet textCounter
        String text = scanner.nextLine();    


        while (!textCounter.isStop()) {       // Så länge texten inte är "stop" "--=+"; while(true) fortsätter loopen
            text = scanner.nextLine();        // Läser in ny rad från användaren
            textCounter.addText(text);        // Skickar in text till textCounter och uppdaterar räknare för rader, tecken, ord och längsta ord
        }

        System.out.println("Antal rader: " + textCounter.getRowCounter());
        System.out.println("Antal tecken: " + textCounter.getCharacterCounter());
        System.out.println("Antal ord: " + textCounter.getWordCounter());
        System.out.println("Längsta ord: " + textCounter.getLongestWord());
    }
}

/*
Flödesbeskrivning

1. Användaren skriver text som läses i Main med Scanner.
2. Main anropar addText(text) i Counter och skickar texten dit.
3.Counter uppdaterar sina attribut (rader, tecken, ord, längsta ord).
4.Om texten är 'stop' blir isStopped true.
5.Main fortsätter läsa i en while-loop tills isStopped blir true.
6.När loopen slutar, hämtar Main resultat från Counter med get-metoder.
7.Slutligen skriver Main ut resultaten till användaren.

 */
