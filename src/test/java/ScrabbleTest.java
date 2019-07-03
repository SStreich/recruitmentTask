import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrabbleTest {


    @Test
    void checkScoresForLowercaseWord() {
        Scrabble scrabble = new Scrabble("cabbage");
        assertEquals(14, scrabble.getScore());
    }

    @Test
    void  checkScoresForUppercaseWord() {
        Scrabble scrabble = new Scrabble("BANANA");
        assertEquals(8, scrabble.getScore());
    }


    @Test
    void checkWordTestingForNumbers(){
        assertThrows(IllegalArgumentException.class, () -> new Scrabble("1"));
    }

    @Test
    void checkWordTestingForNull() {
        assertThrows(IllegalArgumentException.class, () -> new Scrabble(null));
    }

    @Test
    void checkWordTestingForSpace() {
        assertThrows(IllegalArgumentException.class, () -> new Scrabble(" "));
    }


}