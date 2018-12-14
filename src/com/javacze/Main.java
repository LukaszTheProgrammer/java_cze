package com.javacze;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("/Users/lukasz/plik_do_zapisu.txt");
        printWriter.append("Zapisujemy pierwszą linię");
        printWriter.close();
    }
}

