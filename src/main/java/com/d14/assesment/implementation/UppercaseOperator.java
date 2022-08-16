package com.d14.assesment.implementation;

import java.util.Locale;

public class UppercaseOperator implements  Operator{
    @Override
    public String applyOperator(String textMessage) {
        String text = textMessage.toUpperCase(Locale.ROOT);
        System.out.println("Text after upper case operator applied is :" + text);
        return text;
    }
}
