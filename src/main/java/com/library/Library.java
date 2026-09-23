package com.library;


import java.util.Arrays;

public class Library {
    private static Book[] book = new Book[10];
    public static Member[] member = new Member[10];
    private static Borrowedbooks[] borrowedBooks = new Borrowedbooks[10];
    private static int bookNumber = 1;
    public static int membercount = 0;

    static void main(){
        booksStarterPack();
        addBook();
        addMember();
        IO.println(book[4]);
        IO.println(book[5]);
        borrowedBooks[3].setMember(member[0]);
        IO.println(borrowedBooks[3].getmember() + " " + borrowedBooks[3].getBook());
        IO.println(borrowedBooks[5].getmember() + " " + borrowedBooks[5].getBook());



        IO.println(logIn());

//        IO.println(member[x].getMemberName());

        IO.println(membercount);
        printMembers();


    }

    private static boolean logIn() {
        String userName = IO.readln("Enter your  username");
        String pinCode = (IO.readln("enter your pincode"));
        int intex = 0;
        for (int i = 0; i < membercount; i++) {
            if ((pinCode.equals(member[intex].getPinCode()) && userName.equals(member[intex].getMemberName())))
                return true;

            else intex++;

        if (membercount == intex)
                IO.println("Wrong Username or pincode please try again");
        }
        return false;
    }

    private static int getBookNumber(){
        return bookNumber++;
    }
    private static void booksStarterPack(){
        book[0] = new Book(getBookNumber(),"Javautvecklare för nybörjare", "Lin Ux");
        book[1] = new Book(getBookNumber(),
                "1:or och 0:or - en resa in i datorernas förundrande värld", "Mic Rosoft");
        book[2] = new Book(getBookNumber(),"En varg liggger begraven", "Pelle och Vargen");
        book[3] = new Book(getBookNumber(),"Hur du mår bättre utan att må dåligt", "Inga Beskymmer");
        book[4] = new Book(getBookNumber(),"Hur du gör en Copy Konstruktor och varför", "Ulf Kristersson");
        for (int i = 0; i < 5; i++) {
            borrowedBooks[i] = new Borrowedbooks(book[i]);
        }

    }
    private static Member addMember(){
      return member[membercount++] = new Member();

    }
    private static void addBook(){
        if (bookNumber-1 >= book.length)
            book = Arrays.copyOf(book, book.length * 2);
        String name = IO.readln("Enter the name of the book you want to add: ");
        String author = IO.readln("Enter the author of the book: ");
        book[bookNumber-1] = new Book(getBookNumber(), name, author);
        IO.println(bookNumber);
        borrowedBooks[bookNumber -2] = new Borrowedbooks(book[bookNumber - 2]);

    }
    private static void printMembers(){
        IO.println("-----------------------------------------------");
        IO.println("-Pincode-\t-Nr. of loans- \t -Member name-");
        for (int i = 0; i < membercount; i++) {
            IO.println("  " + member[i].getPinCode() + "\t\t\t  " + member[i].getNumberOfloans()
                    + "\t\t\t " + String.format("%.15s",member[i].getMemberName()));
        }
        IO.println("-----------------------------------------------");
        }


}


