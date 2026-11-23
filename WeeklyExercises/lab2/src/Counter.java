/**
 * An interface defining methods for processing and analyzing text strings.
 */
public interface Counter {

    /**
     * Counts the number of words in a given sentence.
     * @param sentence The text to analyze.
     * @return The total number of words.
     */
    int countWords(String sentence);

    /**
     * Counts the number of alphabetic letters in a given sentence.
     * @param sentence The text to analyze.
     * @return The total number of letters.
     */
    int countLetters(String sentence);

    /**
     * Gets the total character length of a given sentence, including spaces.
     * @param sentence The text to analyze.
     * @return The total length of the string.
     */
    int getLength(String sentence);//Gets the length of sentence.

}
