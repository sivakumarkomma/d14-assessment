package com.d14.assesment.implementation;

import java.util.Locale;

public class LowercaseOperator implements  Operator{
    @Override
    public String applyOperator(String textMessage) {
        String text = textMessage.toLowerCase(Locale.ROOT);
        System.out.println("Text after lower case operator applied is :" + text);
        return text;
    }
}
