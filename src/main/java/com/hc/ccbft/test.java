package com.hc.ccbft;

import java.util.Map;

public class test {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()
             ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
