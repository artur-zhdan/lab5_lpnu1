package lab5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class ReverseWordInQuestionTest {

    @org.junit.jupiter.api.Test
    void TestReversion() {
        String text="What is your name?";
        ReverseWordInQuestion object=new ReverseWordInQuestion();
        assertEquals("What is ruoy name?", object.Reversion("What is your name?"));
    }
    @org.junit.jupiter.api.Test
    void TestIfTextNull(){
        String text = "";
        ReverseWordInQuestion object=new ReverseWordInQuestion();
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                object.Reversion(text));
    }
    @org.junit.jupiter.api.Test
    void TestIfNoQuestionSentences(){
        String text="Hello world. My name is Artur. I`m programer";
        ReverseWordInQuestion object=new ReverseWordInQuestion();
        assertEquals("Hello world. My name is Artur. I`m programer", object.Reversion("Hello world. My name is Artur. I`m programer"));
    }
}