import java.util.Arrays;
import java.util.HashMap;

public class Scrabble {
    private String word;
    private HashMap<Character, Integer> pointValues;


    Scrabble(String word) {
        if(!checkWord(word)) throw new IllegalArgumentException("Word that you've entered is invalid!");
        assignPointValues();
        this.word = word.toUpperCase();
    }

    private boolean checkWord(String wordToCheck) {
        if(wordToCheck == null) return false;
        for (char letter: wordToCheck.toCharArray()) {
            if(!Character.isLetter(letter)) return false;
        }
            return true;
    }

    public int getScore() {
        int scores = 0;
        for (char letter : word.toCharArray()) {
            scores += pointValues.get(letter);
        }
        return scores;
    }

    private void assignPointValues() {
        this.pointValues = new HashMap<>();

        char[] lettersFor1 = {'A', 'E', 'I', 'O', 'L', 'N', 'R', 'S', 'T'};
        char[] lettersFor2 = {'D', 'G'};
        char[] lettersFor3 = { 'B', 'C', 'M', 'P'};
        char[] lettersFor4 = {'F','H', 'V','W','Y' };
        char[] lettersFor8 = {'J', 'X'};
        char[] lettersFor10 = {'Q', 'Z'};

        putToMap(lettersFor1, 1);
        putToMap(lettersFor2, 2);
        putToMap(lettersFor3, 3);
        pointValues.put('K', 5);
        putToMap(lettersFor4, 4);
        putToMap(lettersFor8, 8);
        putToMap(lettersFor10, 10);

    }

    private void putToMap(char[] chars, int value) {
        for(char letter : chars){
            pointValues.put(letter, value);
        }
    }
}
