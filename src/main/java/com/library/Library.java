package com.library;


public class Library {
    private static Book[] book = new Book[10];
    private static Member[] member = new Member[10];
    private static int bookNumber = 1;
    private static int membercount = 0;

    static void main(){
        booksStarterPack();
        addBook();
        addBook();
        IO.println(book[0]);
        IO.println(book[1]);
        IO.println(book[2]);
        IO.println(book[3]);
        IO.println(book[4]);
        IO.println(book[5]);
        IO.println(book[6]);
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
        String name = IO.readln("Enter the name of the book you want to add: ");
        String author = IO.readln("Enter the author of the book: ");
        return book[bookNumber-1] = new Book(getBookNumber(), name, author);
    }
}


