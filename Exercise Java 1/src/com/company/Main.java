package com.company;

public class Main {

    public static void main(String[] args) {

    byte myByte_variable = 10;
    Short myShort_variable = 20;

    int myInt_variable = 50;
    long myLongVariable = 50000L+(10L*(myByte_variable+myShort_variable+myInt_variable));

    System.out.println("Long Value is" + myLongVariable);;

    short shortValue = (short) (1000+10*(myByte_variable+myShort_variable+myInt_variable));
    System.out.println(shortValue);

    }
}
