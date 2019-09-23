package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if (hourOfDay>=0 && hourOfDay<= 24) {
            if (barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            }else{
                System.out.println("dog is not barking");
                return false;
            }
        }else{
            return false;

        }
    }
}
