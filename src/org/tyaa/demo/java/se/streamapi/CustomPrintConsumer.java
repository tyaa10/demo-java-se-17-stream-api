package org.tyaa.demo.java.se.streamapi;

import java.util.function.Consumer;

public class CustomPrintConsumer implements Consumer {
    @Override
    public void accept(Object o) {
        System.out.printf("Result: %s\n", o);
    }
}
