package com.hc.ccbft.practice.chapter11;

import java.util.ArrayList;
import java.util.Collection;

public class Generator {
    int cnt = 0;
    public String next() {
        switch (cnt) {
            default:
            case 0: cnt++; return "Star Wars";
            case 1: cnt=0; return "Snow White";
        }
    }

    void fill(String[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = next();
        }
    }

    void fill(Collection<String> a, int n) {
        for (int i = 0; i < n; i++) {
            a.add(next());
        }
    }

    public static void main(String[] args) {
        Generator gen = new Generator();
        String a[] = new String[10];
        gen.fill(a);
        System.out.println(a);
        ArrayList<String> al = new ArrayList<String>();
        gen.fill(al, 3);
        System.out.println(al);
    }
}
