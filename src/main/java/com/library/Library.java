package com.library;


public class Library {
    private static Book[] book = new Book[10];
    private static int bookNumber = 1;
    static void main(){
        booksStarterPack();

        IO.println(book[0]);
        IO.println(book[1]);
        IO.println(book[2]);
        IO.println(book[3]);
        IO.println(book[4]);

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
}


