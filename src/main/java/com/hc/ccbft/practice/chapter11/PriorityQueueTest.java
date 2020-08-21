package com.hc.ccbft.practice.chapter11;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Random rand = new Random(1);
        PriorityQueue<Double> pq = new PriorityQueue<Double>();
        for (int i = 0; i < 4; i++) {
            pq.offer(rand.nextDouble());
        }

        System.out.print(pq);
        System.out.println();

        Iterator<Double> d = pq.iterator();
        while (d.hasNext()) {
            System.out.println(pq.poll());
        }
    }
}
