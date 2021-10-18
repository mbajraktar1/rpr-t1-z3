package com.company;

public class Sat {
    private static Integer sati;
    private static Integer minute;
    private static Integer sekunde;

    static {
        sati = 0;
        minute = 0;
        sekunde = 0;
    }

    public Sat(int h, int m, int s) {
        sati = h;
        minute = m;
        sekunde = s;
    }

    public static void Postavi(Integer h, Integer m, Integer s) {
        sati = h;
        minute = m;
        sekunde = s;
    }

    public static void Sljedeci() {
        sekunde = sekunde + 1;
        if(sekunde == 60) {
            sekunde = 0;
            minute = minute + 1;
        }
        if(minute == 60) {
            minute = 0;
            sati = sati + 1;
        }
        if(sati == 24) sati = 0;
    }

    public static void Prethodni() {
        sekunde = sekunde - 1;
        if(sekunde == -1) {
            sekunde = 59;
            minute = minute - 1;
        }
        if(minute == -1) {
            minute = 59;
            sati = sati - 1;
        }
        if(sati == -1) sati = 23;
    }

    public static void PomjeriZa(Integer pomak) {
        if(pomak > 0) {
            for(Integer i = 0; i < pomak; i++) Sljedeci();
        }
        else {
            for(Integer i = 0; i < -pomak; i++) Prethodni();
        }
    }

    public static final Integer DajSate() {
        return sati;
    }

    public static final Integer DajMinute() {
        return minute;
    }

    public static final Integer DajSekunde() {
        return sekunde;
    }

    public static final void Ispisi() {
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }
}
