package org.tyaa.demo.java.se.streamapi;

import java.util.Comparator;

public class CustomIntComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
