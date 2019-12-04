package com.dupel.labs.task2;



import java.util.ArrayList;

public class WordCounter {
    String text;
    static ArrayList<String> wordList;
    static  ArrayList<Integer> wordPosList;
    private static  void compute(String text){

        wordList = new ArrayList<String>();
        wordPosList = new ArrayList<Integer>();

        boolean wordEnd = true;
        int wordBegining = 0;
        for(int i = 0; i < text.length(); i++){
            if( text.charAt(i) != ' ' && wordEnd ) {
                wordEnd = false;
                wordBegining = i;
            }

            if ( ( text.charAt(i) == ' ' || i == text.length() - 1 ) && ! wordEnd )  {
                // remind word
                if ( i == text.length() -1 )
                    i++;

                String newWord = text.substring(wordBegining,i);
                int pos = wordList.indexOf(newWord);
                if ( pos == -1 ){
                    wordList.add(newWord);
                    wordPosList.add(1);
                } else {
                    wordPosList.set(pos,wordPosList.get(pos)+1);
                }
                wordEnd = true;
            }

        }

    }
    public WordCounter(){
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
        compute(text);
    }

    public static int count(String text){

        compute(text);

        return wordList.size();
    }
    public int spec_word_count(String word){
        int pos = wordList.indexOf(word);
        return pos == -1? 0: wordPosList.get(pos);
    }

    public String to_string(){
        String res = new String();
        res += "Text: " + this.text + '\n';
        res += "Word count:\n";
        for(int i = 0; i < wordList.size(); i++){
            res += wordList.get(i) +" " + Integer.toString(wordPosList.get(i)) + '\n';
        }
        return res;
    }
}
