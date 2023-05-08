package lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordInQuestionTest {

    @Test
    void testReverse() {
        String text = "What is your name?";
        ReverseWordInQuestion object = new ReverseWordInQuestion();
        assertEquals("What is ruoy name?", object.reverse(text));
    }

    @Test
    void testIfTextNull() {
        String text = "";
        ReverseWordInQuestion object = new ReverseWordInQuestion();
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                object.reverse(text));
    }

    @Test
    void testIfNoQuestionSentences() {
        String text = "Hello world. My name is Artur. I`m programmer";
        ReverseWordInQuestion object = new ReverseWordInQuestion();
        assertEquals("Hello world. My name is Artur. I`m programmer", object.reverse(text));
    }
}
