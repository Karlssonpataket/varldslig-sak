package com.library;

import java.util.Arrays;

public class Member {
    private int memberpassword;
    private String memberName;
    private int numberOfloans;

    public Member(){

        if (Library.membercount >= Library.member.length)
            Library.member = Arrays.copyOf(Library.member, Library.member.length * 2 );
        this.memberName = IO.readln("Whats your name?: ");
        boolean run = true;
        do {
            try {
                this.memberpassword = Integer.parseInt(IO.readln("Please enter a password for your library membership: "));
            } catch  (NumberFormatException e) {
                IO.println("Password must consist of numbers only");
                continue;
            }
            run = false;
        } while (run);

        this.numberOfloans = 0;
    }

    public int getMemberpassword() {
        return memberpassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getNumberOfloans() {
        return numberOfloans;
    }
}