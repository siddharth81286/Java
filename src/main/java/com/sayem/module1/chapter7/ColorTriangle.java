package com.sayem.module1.chapter7;

class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String c, String s,
                  double w, double h) {
        super(s, w, h);

        color = c;
    }

    String getColor() { return color; }

    void showColor() {
        System.out.println("Color is " + color);
    }
}