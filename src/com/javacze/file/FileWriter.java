package com.javacze.file;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {

    public void write(String filename, String line) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new java.io.FileWriter(filename, true));
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        printWriter.println("Linia tekstu");
        printWriter.close();
    }
}
