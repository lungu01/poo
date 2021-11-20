package com.company;
import java.util.*;


 public class Manipulator_Info{

    public static boolean isPuncMarks(char ch){
        return ch == '.' || ch == '?' || ch == '!';
    }
    public static boolean isLetter(char ch){
        return (ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90);
    }
    public  static boolean isVowels(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // _Basic Level_
    public static int numSentences(String str){
        int count = 0;
        char[] str_char = str.toCharArray();

        for(char c : str_char){
            if(isPuncMarks(c)){
                count++;
            }
        }
        return count;
    }

    public static int numWords(String str){
        int count = 0;
        str = str.replaceAll("\\( \\) \\[ \\] \\{ \\}","");
        char[] str_char = str.toCharArray();

        for(char c : str_char) {
            if (c == ' ' || isPuncMarks(c)) {
                count++;
            }
        }
        return count;
    }

    //  _Advanced Level_ :1
    public static int numLetters(String str){
        int count = 0;
        char[] str_char = str.toCharArray();

        for(char c : str_char){
            if(isLetter(c)){
                count++;
            }
        }
        return count;
    }

    public static int numVowels(String str){
        int count = 0;
        str = str.toLowerCase();
        char[] str_char = str.toCharArray();

        for(char c : str_char){
            if(isVowels(c)){
                count++;
            }
        }
        return count;
    }

    public static int numConsonants(String str){
        int count = 0;
        str = str.toLowerCase();
        char[] chars = str.toCharArray();

        for(char c : chars){
            if( isLetter(c) && !isVowels(c)){
                count++;
            }
        }
        return count;

    }

    //_Advanced Level_ : 2

    private static String longestWord(String[] splited) {
        return Arrays.stream(splited).max(Comparator.comparingInt(String::length)).orElse(null);
    }

    public static void topFiveWords(String str){
        int max = 0;
        String word = null;
        str = str.toLowerCase();
        str = str.replaceAll("[.,?!]","");
        String[] tok = str.split(" ");
        List<String> tok_li = new ArrayList<>(Arrays.asList(tok));


        System.out.println("\n ## Top 5 Words: ##\n");
        for( int i = 0 ; i < 5 ; i++ ) {
            for (int j = 0; j < tok_li.size(); j++) {
                int numCollWord = Collections.frequency(tok_li, tok[j]);
                if(numCollWord > max){
                    max = numCollWord;
                    word = tok[j];
                }
                if(j == tok_li.size() - 1){
                    System.out.println((i+1) + ". " + word + " : " + max + " time(s)");
                    tok_li.removeAll(Collections.singleton(word));
                    max = 0;
                }
            }
        }

        String[] text = str.split("[\\s,.]+");
        System.out.println("\nLongest word : " + longestWord(text));
    }
}

