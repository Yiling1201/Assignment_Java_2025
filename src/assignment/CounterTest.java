package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CounterTest {

    @Test
    public void testRowsCounter() {
        Counter counter = new Counter();
        counter.addText("Hej!");
        counter.addText("Hur mår du?");

        int actual = counter.getRowCounter();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testCharacterCounter() {
        Counter counter = new Counter();
        counter.addText("Hej!");
        counter.addText("Hur mår du?");

        int actual = counter.getCharacterCounter();
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void testStopFunktion(){
        Counter counter = new Counter();
        counter.addText("Hej!");
        counter.addText("Hur mår du?");
        counter.addText("stop");

        int actual = counter.getRowCounter();
        int expected = 2;

        assertEquals(expected,actual);

    }
}
