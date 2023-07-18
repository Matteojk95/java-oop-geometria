package org.lessons.java.geometria;

public class Rettangolo {

    // CAMPI

    int base;
    int altezza;

    // COSTRUTTORI
    Rettangolo(int base, int altezza){
        this.base= base;
        this.altezza= altezza;
    }

    // METODI

    int calcoloarea() {
        return base*altezza;
    }
    int calcoloperimetro() {
        return (base*2)+(altezza*2);
    }
}
