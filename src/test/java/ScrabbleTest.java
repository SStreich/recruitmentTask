import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrabbleTest {

    @Test
    void checkWordTestingForNumbers(){
        assertThrows(IllegalArgumentException.class, () -> new Scrabble("1"));
    }

    @Test
    void checkScores() {
        Scrabble scrabble = new Scrabble("cabbage");
        assertEquals(14, scrabble.getScore());
    }
}