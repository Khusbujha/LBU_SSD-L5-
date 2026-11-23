/**
 * Implements the Counter interface to process and analyze strings.
 */
public class WordProcessor implements Counter {
    //Fallback text attribute
    private String text;

    /**
     * Gets the fallback text.
     * @return The stored fallback text.
     */
    public String getText(){
        return text;
    }

    /**
     * Sets the fallback text.
     * @param text The text to store as a fallback.
     */
    public void setText(String text){
        this.text = text;
    }

    @Override
    public int countWords(String sentence){
        //Use fallback text if null is passed
        if (sentence == null){
            sentence= this.text;
        }

        //Split on spaces and return the length of the resulting array
        String[] words = sentence.trim().split(" ");
        return words.length;
    }

    @Override
    public int countLetters(String sentence) {
        //Use fallback text if null is passed
        if (sentence == null){
            sentence= this.text;
        }

        int letters = 0;
        //Count the number of alphabetic letters in the text ignoring spaces and other characters
        for (int i = 0; i < sentence.length(); i++){
            if(Character.isLetter((sentence.charAt(i)))){
                letters++;
            }
        }
        //Return the count of alphabetical letters
        return letters;
    }

    @Override
    public int getLength(String sentence){
        //Use fallback text if null is passed
        if (sentence == null){
            sentence= this.text;
        }

        //Return the total length of characters in the text
        return sentence.length();
    }
}
