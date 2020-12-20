package com.cst.singletonpattern;

public class TestSingleton {

    public static void main(String[] args) {

        SingletonThreadSafe singletonEager1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonEager2 = SingletonThreadSafe.getInstance();
        System.out.println(singletonEager1);
        System.out.println(singletonEager1);
    }
}
