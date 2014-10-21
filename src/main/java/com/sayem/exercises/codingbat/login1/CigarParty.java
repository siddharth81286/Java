package com.sayem.exercises.codingbat.login1;

public class CigarParty {

    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));
    }

    private static boolean cigarParty(int cigars, boolean isWeekend) {

        if (isWeekend && cigars > 40 && cigars < 60){
            return true;
        }else if (isWeekend && cigars >= 60){
            return true;
        }else{
            return false;
        }
    }
}
