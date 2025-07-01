package sets.exBasics.ex02;

public class Main {
    public static void main(String[] args) {

        UniqueWordsSet wordsSet = new UniqueWordsSet();

        wordsSet.addWord("Java");
        wordsSet.addWord("Python");
        wordsSet.addWord("JavaScript");
        wordsSet.addWord("C#");

        wordsSet.showAllWords();

        wordsSet.removeWord("JavaScript");
        wordsSet.showAllWords();

        System.out.println(wordsSet.isPresent("Java"));
    }
}
