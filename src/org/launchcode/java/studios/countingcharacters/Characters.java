package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;


public class Characters {
    public static void main(String[] args) {

        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        //char[] charactersInString = hiddenFigures.toCharArray();

        HashMap<Character, Integer> charCount  = new HashMap<>();
        char[] charactersInString = hiddenFigures.toCharArray();

        for (char c : charactersInString) {
            if (!charCount.containsKey(c)) {
                charCount.put(c, 1);
            } else {
                charCount.put(c, charCount.get(c) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
