package com.sayem.chapter8.bookpackext;

// Use the Book Class from bookpack.
class UseBook {
    public static void main(String args[]) {
        com.sayem.chapter8.bookpack.Book books[] = new com.sayem.chapter8.bookpack.Book[5];

        books[0] = new com.sayem.chapter8.bookpack.Book("Java: A Beginner's Guide",
                "Schildt", 2011);
        books[1] = new com.sayem.chapter8.bookpack.Book("Java: The Complete Reference",
                "Schildt", 2011);
        books[2] = new com.sayem.chapter8.bookpack.Book("The Art of Java",
                "Schildt and Holmes", 2003);
        books[3] = new com.sayem.chapter8.bookpack.Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new com.sayem.chapter8.bookpack.Book("On the Road",
                "Kerouac", 1955);

        for(int i=0; i < books.length; i++) books[i].show();
    }
}