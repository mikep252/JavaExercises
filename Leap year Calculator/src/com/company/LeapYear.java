package com.company;

public class LeapYear {
    public static boolean isLeepYear(int year) {
        int option = 1;
        if (year >= 1 && year <= 9999) {
            option = 2;
        }else{
            return false;
        }

        switch (option) {
            case 1:
                return false;

            case 2:
                if (year % 4 == 0 ) {
                    if(year % 100 == 0)
                    {
                        if(year % 400 == 0)
                        {
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return true;
                    }
                }else {
                    return false;
                }

            default:
                return false;
        }
    }
}






