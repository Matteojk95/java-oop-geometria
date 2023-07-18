package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int altezza = scan.nextInt();

        Rettangolo top = new Rettangolo(base, altezza);

        System.out.println(top.calcoloarea());
        System.out.println(top.calcoloperimetro());

    }
}

