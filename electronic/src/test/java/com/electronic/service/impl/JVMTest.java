package com.electronic.service.impl;

public class JVMTest {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {


        System.out.println("hello world");

        byte[] a, b, c, d, e;
        a = new byte[1 * _1MB / 4];
        e = new byte[1 * _1MB / 4];
        b = new byte[4 * _1MB];
        c = new byte[4*_1MB];
        c = null;
        c = new byte[4*_1MB];


    }

    public void lock() {

        synchronized (this) {

        }

    }

}
