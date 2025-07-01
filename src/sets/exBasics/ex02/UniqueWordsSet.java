package sets.exBasics.ex02;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsSet {

    private Set<String> words;

    public UniqueWordsSet() {
        this.words = new HashSet<>();
    }

    public void addWord(String word) {
        words.add(word);
    }

    public void removeWord(String wordToRemove) {
        verifyStorage();
        if (wordToRemove.contains(wordToRemove)) words.remove(wordToRemove);
        else System.out.println("This word is not in the list");
    }

    public boolean isPresent(String word) {
        verifyStorage();
        return words.contains(word);
    }

    public void showAllWords() {
        verifyStorage();
        System.out.println(words);
    }

    private void verifyStorage() {
        if (this.words.isEmpty()) throw new RuntimeException("There is no word");
    }
}
