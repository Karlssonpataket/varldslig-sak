package com.library;

import java.util.Arrays;

public class Member {
    private String pinCode;
    private String memberName;
    private int numberOfloans;

    public Member(){

        if (Library.membercount >= Library.member.length)
            Library.member = Arrays.copyOf(Library.member, Library.member.length * 2 );
        this.memberName = IO.readln("Whats your name?: ");
        boolean run = true;
        do {
            this.pinCode = (IO.readln("Please enter a pincode for your library membership 4 numbers: "));
            if (checkPincode(pinCode)) {
                run = false;
            }
            else
                IO.println("Password must consist of 4 NUMBERS only");

        } while (run);

        this.numberOfloans = 0;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getNumberOfloans() {
        return numberOfloans;
    }
    private boolean checkPincode(String pincode){
        int sum = 0;
        for (int i = 0; i < pincode.length(); i++)
            if (Character.isDigit(pincode.charAt(i)))
                sum ++;

        return sum == 4;


    }
}