package com.library;

public class Member {
    private int memberpassword;
    private String memberName;
    private int numberOfloans;

    public Member(){
        this.memberName = IO.readln("Whats yoor name?: ");
        this.memberpassword = Integer.parseInt(IO.readln("Please enter a password for your library membership: "));
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