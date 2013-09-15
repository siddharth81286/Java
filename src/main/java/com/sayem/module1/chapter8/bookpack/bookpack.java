package com.sayem.module1.chapter8.bookpack;

class Bookpack {
    private String title;
    private String author;
    private int pubDate;

    Bookpack(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

