package com.example.codewars;

import com.sun.jdi.IntegerValue;

import java.time.LocalDateTime;

public class KeepHydrated {
    public static int Liters(double time)  {

        double litres = (time * 0.5);

        int myLiters = (int) litres;


        return myLiters;
    }

    public static void main(String[] args) {
        System.out.println(Liters(3));
    }
}
