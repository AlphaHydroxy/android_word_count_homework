package com.example.user.wordcounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by user on 03/07/2017.
 */

public class Wordcount {

        public String countWord(String word) {
            String[] wordArray = word.trim().split("[(' '),.-]");
            int wordCount = wordArray.length;
            return "You wrote = " + wordCount + " word(s)!";
        }

        public String countWordOccurrence(String word) {
            String[] wordOccurrence = word.trim().split("[(' '),.-]");
            Map<String, Integer> map = new HashMap<String, Integer>();
            for (String str : wordOccurrence) {
                if (map.get(str) != null) {
                    map.put(str, map.get(str) +1);
                } else {
                    map.put(str, 1);
                }
            }
            Set<String> str2 = map.keySet();
            String concatenatedOutput = "";
            for(String str : str2){
                concatenatedOutput += ("Words: " + str + " repeated " + map.get(str) + " times\n");
            }
            return concatenatedOutput;
        }
    }
