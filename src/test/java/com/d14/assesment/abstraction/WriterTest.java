package com.d14.assesment.abstraction;

import com.d14.assesment.implementation.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WriterTest {
    @Test
    public void testStringWriterWithLowerCaseAndStupidRemover(){
        String inputText = "THIS IS STUPID AND STUPID STRING WRITER";

        Operator lowercaseOperator = new LowercaseOperator();
        Operator stupidRemoverOperator = new StupidRemoverOperator();
        Writer stringsWriter = new StringsWriter();

        stringsWriter.writeToWriter(inputText, lowercaseOperator, stupidRemoverOperator);
        String finalText = stringsWriter.getWrittenText();

        assertThat(finalText, equalTo("this is s***** and s***** string writer"));
    }

    @Test
    public void testStringWriterWithUpperCaseAndDuplicateRemover(){
        String inputText = "this is is stupid and and weird string writer";

        Operator uppercaseOperator = new UppercaseOperator();
        Operator duplicateRemoverOperator = new DuplicateRemoverOperator();
        Writer stringsWriter = new StringsWriter();

        stringsWriter.writeToWriter(inputText, uppercaseOperator, duplicateRemoverOperator);
        String finalText = stringsWriter.getWrittenText();

        assertThat(finalText, equalTo("THIS IS STUPID AND WEIRD STRING WRITER"));
    }

    @Test
    public void testFileWriterWithLowerCaseAndStupidRemover(){
        String inputText = "THIS IS STUPID AND STUPID FILE WRITER";

        Operator lowercaseOperator = new LowercaseOperator();
        Operator stupidRemoverOperator = new StupidRemoverOperator();
        Writer stringsWriter = new StringsWriter();

        stringsWriter.writeToWriter(inputText, lowercaseOperator, stupidRemoverOperator);
        String finalText = stringsWriter.getWrittenText();

        assertThat(finalText, equalTo("this is s***** and s***** file writer"));
    }

    @Test
    public void testFileWriterWithUpperCaseAndDuplicateRemover(){
        String inputText = "this is is stupid and and weird file writer";

        Operator uppercaseOperator = new UppercaseOperator();
        Operator duplicateRemoverOperator = new DuplicateRemoverOperator();
        Writer filesWriter = new FilesWriter();

        filesWriter.writeToWriter(inputText, uppercaseOperator, duplicateRemoverOperator);
        String finalText = filesWriter.getWrittenText();

        assertThat(finalText, equalTo("THIS IS STUPID AND WEIRD FILE WRITER"));
    }
}
