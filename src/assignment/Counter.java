package assignment;

public class Counter {
    //Attribute
    private int rowCounter; // Antal rader
    private int characterCounter; // Antal tecken totalt
    private int wordCounter; // Antal ord totalt
    private String longestWord; // Längsta ordet
    private boolean isStopped; // true om användaren har skrivit "stop"

    //Konstruktor
    //Används för att skapa ett nytt objekt och ge attributen initiala värden.
    public Counter() {
        rowCounter = 0;
        characterCounter = 0;
        wordCounter = 0;
        longestWord = ""; // tomt, börjar med inget
        isStopped = false; // ingen har skrivit "stop" ännu
    }

    //Tar emot text, hanterar om det är stop, och räknar rader, tecken, ord och hittar längsta ord
    public void addText(String text) {
        if (text.equalsIgnoreCase("stop")) { //Här är en if-sats. Om det inte är "stop" kan programmet fortsätta.
            isStopped = true; // Om text är "stop", sluta läsa mer
            return; // Gå ut ur metoden direkt
        }

        //räknar rader
        rowCounter++; // Ökar antal rader med 1 varje gång när användaren använda metoden addText (trycker Enter).

        //räknar tecken
        characterCounter += text.length(); // Lägger till antalet tecken i characterCounter, inklusive mellanslag och symboler

        //räknar ord
        String[] words = text.split(" ");// Delar upp texten i ord med mellanslag
        wordCounter += words.length;// Räknar antalet ord och Lägg till wordCounter

        // Hittar det längsta ordet i loopen.
        // Om words[i] är längre än longestWord, uppdatera longestWord till words[i].
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];// Nytt längsta ord
            }
        }
    }

    //Kollar om användaren skrev "stop"
    public boolean isStop() { //en boolean-metod som returnerar true eller false
        return isStopped; // true om användaren skrev "stop", annars false
    }

    // Hämtar antal rader hittills
    public int getRowCounter() {
        return rowCounter;
    }

    // Hämtar antal tecken hittills
    public int getCharacterCounter() {
        return characterCounter;
    }

    // Hämtar antal ord hittills
    public int getWordCounter() {
        return wordCounter;
    }

    // Hämtar det längsta ordet hittills
    public String getLongestWord() {
        return longestWord;
    }
}