package com.hc.ccbft.practice.chapter10;

public class WithInner {
    class Inner {
        Inner(String s) {
            System.out.println("WithInner.Inner() " + s);
        }
    }
}
