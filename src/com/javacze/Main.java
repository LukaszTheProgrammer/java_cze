package com.javacze;

import com.javacze.a.Osoba;

public class Main {

    public static void main(String[] args) {
        Osoba o = new Osoba("Jan", "Kowalski");

        System.out.println(o.getImie());
        System.out.println(o.getNazwisko());

    }
}

