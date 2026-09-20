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

        addMember();
        addMember();

        printMembers();

//        addMember();
//        addMember();
//        IO.println(member[0].getMemberName() + " " + member[0].getMemberpassword() + " " +member[0].getNumberOfloans());
//        IO.println(member[1].getMemberName() + " " + member[1].getMemberpassword() + " " +member[1].getNumberOfloans());

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
    }
    private static Member addMember(){
      return member[membercount++] = new Member();

    }
    private static Book addBook(){
        if (bookNumber-1 >= book.length)
            book = Arrays.copyOf(book, book.length * 2);
        String name = IO.readln("Enter the name of the book you want to add: ");
        String author = IO.readln("Enter the author of the book: ");
        return book[bookNumber-1] = new Book(getBookNumber(), name, author);
    }
    private static void printMembers(){
        IO.println("-----------------------------------------------");
        IO.println("-Pincode-\t-Nr. of loans- \t -Member name-");
        for (int i = 0; i < membercount; i++) {
            IO.println("  " + member[i].getMemberpassword() + "\t\t\t  " + member[i].getNumberOfloans()
                    + "\t\t\t " + String.format("%.15s",member[i].getMemberName()));
        }
        IO.println("-----------------------------------------------");
        }


}


