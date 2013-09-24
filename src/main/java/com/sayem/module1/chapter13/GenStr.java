package com.sayem.module1.chapter13;

// Here, T is bound by String.
class GenStr<T extends String> {
    T str; // here, T will be replaced by String

    GenStr(T o) {
        str = o;
    }

    T getstr() { return str; }
}