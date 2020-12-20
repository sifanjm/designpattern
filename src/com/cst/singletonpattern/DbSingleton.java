package com.cst.singletonpattern;

public class DbSingleton {

    private static DbSingleton instance = null;

    private DbSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            instance = new DbSingleton();
        }
        return instance;
    }
}
