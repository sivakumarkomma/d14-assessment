package com.d14.assesment;

import com.d14.assesment.abstraction.FilesWriter;
import com.d14.assesment.abstraction.StringsWriter;
import com.d14.assesment.abstraction.Writer;
import com.d14.assesment.implementation.*;

public class WriterDemo {

    public static void main(String[] args) {
        testStringWriter();
        testFileWriter();
    }

    private static void testStringWriter(){
        System.out.println("Testing String writer with lower case and stupid remover operator started");
        Operator lowercaseOperator = new LowercaseOperator();
        Operator stupidRemoverOperator = new StupidRemoverOperator();
        Writer stringsWriter = new StringsWriter();
        String stringsWriterText = "THIS IS STUPID AND STUPID STRING WRITER";
        System.out.println("Original Text: "+ stringsWriterText);
        stringsWriter.writeToWriter(stringsWriterText, lowercaseOperator, stupidRemoverOperator);
        System.out.println("Final Text:" + stringsWriter.getWrittenText());
        System.out.println("Testing String writer with lower case and stupid remover operator completed");
        System.out.println("");

        System.out.println("Testing String writer with upper case and duplicate remover operator started");
        Operator uppercaseOperator = new UppercaseOperator();
        Operator duplicateRemoverOperator = new DuplicateRemoverOperator();
        Writer stringsWriterAnother=new StringsWriter();
        String stringsWriterAnotherText = "this is is stupid and and weird string writer";
        System.out.println("Original Text: "+ stringsWriterAnotherText);
        stringsWriterAnother.writeToWriter(stringsWriterAnotherText, uppercaseOperator, duplicateRemoverOperator);
        System.out.println("Final Text:" + stringsWriterAnother.getWrittenText());
        System.out.println("Testing String writer with upper case and duplicate remover operator completed");
        System.out.println("");
    }

    private static void testFileWriter(){
        System.out.println("Testing File writer with lower case and stupid remover operator started");
        Operator lowercaseOperator = new LowercaseOperator();
        Operator stupidRemoverOperator = new StupidRemoverOperator();
        Writer filesWriter = new FilesWriter();
        String filesWriterText = "THIS IS STUPID AND STUPID FILE WRITER";
        System.out.println("Original Text: "+ filesWriterText);
        filesWriter.writeToWriter(filesWriterText, lowercaseOperator, stupidRemoverOperator);
        System.out.println("Final Text:" + filesWriter.getWrittenText());
        System.out.println("Testing File writer with lower case and stupid remover operator completed");
        System.out.println("");

        System.out.println("Testing File writer with upper case and duplicate remover operator started");
        Operator uppercaseOperator = new UppercaseOperator();
        Operator duplicateRemoverOperator = new DuplicateRemoverOperator();
        Writer filesWriterAnother=new FilesWriter();
        String filesWriterAnotherText = "this is is stupid and and weird file writer";
        System.out.println("Original Text: "+ filesWriterAnotherText);
        filesWriterAnother.writeToWriter(filesWriterAnotherText, uppercaseOperator, duplicateRemoverOperator);
        System.out.println("Final Text:" + filesWriterAnother.getWrittenText());
        System.out.println("Testing File writer with upper case and duplicate remover operator completed");
    }
}
