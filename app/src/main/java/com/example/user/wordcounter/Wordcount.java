package com.example.user.wordcounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 03/07/2017.
 */

public class Wordcount {

        public String countWord(String word) {
            String[] wordArray = word.trim().split("[(' '),.-]");
            int wordCount = wordArray.length;
            return "You wrote = " + wordCount + " word(s)!";
        }

//        public String numOfWords(String word){
//            Map<String, Integer> map = new HashMap<>();
//            for (String w : word) {
//                Integer n = map.get(w);
//                n = (n == null) ? 1 : ++n;
//                map.put(w, n);
//            }
//        }re
    }
