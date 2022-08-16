package com.d14.assesment.abstraction;

import com.d14.assesment.implementation.Operator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FilesWriter extends Writer {

    private static final String FILE_NAME = "myfile.dat";

    @Override
    public void writeToWriter(String text, Operator... operators) {
        try {
            FileWriter fw = new FileWriter(FILE_NAME);
            for (Operator operator : operators) {
                text = operator.applyOperator(text);
            }
            fw.write(text);
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getWrittenText() {
        String data = "";
        try {
            File myObj = new File(FILE_NAME);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}
