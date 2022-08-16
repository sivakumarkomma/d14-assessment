package com.d14.assesment.abstraction;

import com.d14.assesment.implementation.Operator;

import java.io.StringWriter;

public class StringsWriter extends Writer{
    StringWriter stringWriter;

    @Override
    public void writeToWriter(String text, Operator... operators) {
        try {
            stringWriter = new StringWriter();
            for(Operator operator: operators){
                text = operator.applyOperator(text);
            }
            stringWriter.write(text);
            stringWriter.close();
        } catch(Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public String getWrittenText() {
        return stringWriter.getBuffer().toString();
    }
}
