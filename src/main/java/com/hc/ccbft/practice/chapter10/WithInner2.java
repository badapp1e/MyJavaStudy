package com.hc.ccbft.practice.chapter10;

public class WithInner2 {
    class Inner2 extends WithInner.Inner {
        Inner2(WithInner wi) {
            wi.super("");
            System.out.println("WithInner2.Inner2()");
        }
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        WithInner2 wi2 = new WithInner2();
        WithInner2.Inner2 w2i2 = wi2.new Inner2(wi);
    }
}
