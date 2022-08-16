package com.d14.assesment.implementation;

public class StupidRemoverOperator implements Operator {
    @Override
    public String applyOperator(String textMessage) {
        String text = textMessage.replace("stupid", "s*****");
        System.out.println("Text after stupid remover operator applied is :" + text);
        return text;
    }
}
