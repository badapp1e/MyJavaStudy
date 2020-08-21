package com.hc.ccbft.practice.chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Gerbil {
    private int gerbilNumber;
    public Gerbil(int i) {
        gerbilNumber = i;
    }
    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops");
    }

    public static void main(String[] args) {
        Map<String, Gerbil> map = new HashMap<String, Gerbil>();
        map.put("Gerbil", new Gerbil(1));
        map.put("hops", new Gerbil(2));

        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
            map.get(s).hop();
        }
    }
}
