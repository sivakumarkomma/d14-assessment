package com.d14.assesment.implementation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateRemoverOperator implements  Operator{

    private static final String REGEX = "\\b(\\w+)(?:\\W+\\1\\b)+";
    @Override
    public String applyOperator(String textMessage) {
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
        // Match whether regex matching with sentence or not
        Matcher match = pattern.matcher(textMessage);
        // Use while loop to find and replace duplicate words
        while(match.find()) {
            textMessage = textMessage.replace(match.group(), match.group(1));
        }
        System.out.println("Text after duplicate remover operator applied is :" + textMessage);
        return textMessage;
    }
}
