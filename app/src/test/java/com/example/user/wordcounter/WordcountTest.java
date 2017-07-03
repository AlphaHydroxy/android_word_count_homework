package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 03/07/2017.
 */

public class WordcountTest {

    Wordcount wordcount;

    @Before
    public void before(){
        wordcount = new Wordcount();
    }

    @Test
    public void wordCount(){
        assertEquals("You wrote = 3 word(s)!", wordcount.countWord(new String("Today is sunny")));
    }

    @Test
    public void wordOccurrence(){
        assertEquals("Words: hello repeated 2 times", wordcount.countWordOccurrence(new String("hello hello")));
    }

}
