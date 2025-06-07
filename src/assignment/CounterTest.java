package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    @Test
    public void testRowsCounter() {       //Här testar jag att antal rader räknas korrekt
        Counter counter = new Counter();  //skapa ett nytt objekt
        counter.addText("Hej!");          //skicka in två rader.
        counter.addText("Hur mår du?");

        int actual = counter.getRowCounter(); //Hämtar det faktiska antalet rader med getRowCounter().
        int expected = 2;

        assertEquals(expected, actual);       //Om lika är testet godkänt.
    }

    @Test
    public void testCharacterCounter() {  //Här testar jag att det totala antalet tecken räknas rätt
        Counter counter = new Counter();
        counter.addText("Hej!");
        counter.addText("Hur mår du?");

        int actual = counter.getCharacterCounter();
        int expected = 15;

        assertEquals(expected, actual);
    }


    @Test
    public void testLongestWord() {      //Här testar jag att det längsta ordet hittas korrekt
        Counter counter = new Counter();
        counter.addText("Hej!");
        counter.addText("Hur mår du?");
        counter.addText("Trevlig helg!");

        String actual = counter.getLongestWord();
        String expected = "Trevlig";

        assertEquals(expected, actual);  //Jämför med det förväntade ordet "Trevlig", Om lika är testet godkänt.
    }


/*
Flöde
Skapa nytt objekt→ skicka in text→hämta resultat→jämför med förväntat→testa olika scenarier.

På så sätt kan vi säkerställa att logikklassen fungerar som den ska.
 */




    @Test
    public void testStopFunktion() {
        Counter counter = new Counter();
        counter.addText("Hej!");
        counter.addText("Hur mår du?");
        counter.addText("stop");

        int actual = counter.getRowCounter();
        int expected = 2;

        assertEquals(expected, actual);
    }

}
