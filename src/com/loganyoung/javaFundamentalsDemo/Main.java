package com.loganyoung.javaFundamentalsDemo;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Droid r2d2 = new Droid();
        r2d2.setSerialNum("R2D2");
        r2d2.setModelType("Astromech");
        r2d2.setPurpose("Starship repair/support");
        System.out.println(r2d2);
        System.out.println(r2d2.speak());



    }
}
