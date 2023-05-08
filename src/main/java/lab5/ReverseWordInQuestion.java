package lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseWordInQuestion {
    public String reverse(String text) {
        if (text == "" || text == null) {
            throw new IllegalArgumentException("Text is null");
        }
        Pattern pattern = Pattern.compile("(what|where|when|who|whom|whose|why|how|which).*?\\?", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            String sentence = matcher.group();
            String[] words = sentence.split("\\s+");
            String wordToReverse = words[words.length / 2];
            StringBuilder reversedWord = new StringBuilder(wordToReverse).reverse();
            words[words.length / 2] = reversedWord.toString();
            String reversedSentence = String.join(" ", words);
            matcher.appendReplacement(result, reversedSentence);
        }
        matcher.appendTail(result);

        if (text.equals(result.toString())) {
            throw new IllegalArgumentException("No question sentences");
        }

        System.out.println(result.toString());
        return result.toString();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a text.");
            return;
        }

        String text = args[0];

        ReverseWordInQuestion reverseWordInQuestion = new ReverseWordInQuestion();
        reverseWordInQuestion.reverse(text);
    }

}
