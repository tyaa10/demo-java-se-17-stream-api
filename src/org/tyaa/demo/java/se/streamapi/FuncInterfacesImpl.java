package org.tyaa.demo.java.se.streamapi;

public class FuncInterfacesImpl {
    public static int compareInt(Object o1, Object o2) {
        return (Integer) o1 - (Integer) o2;
    }
    public static void consumerPrint(Object o) {
        System.out.printf("Result: %s\n", o);
    }
}
