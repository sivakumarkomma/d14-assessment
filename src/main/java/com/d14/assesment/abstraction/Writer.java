package com.d14.assesment.abstraction;

import com.d14.assesment.implementation.Operator;

public abstract class Writer {

    abstract public void writeToWriter(String text, Operator... operator);

    abstract public String getWrittenText();
}
