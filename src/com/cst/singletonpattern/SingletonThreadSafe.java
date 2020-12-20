package com.cst.singletonpattern;

public class SingletonThreadSafe {

    private volatile static SingletonThreadSafe sc = null;

    private SingletonThreadSafe(){}

    //double checking
    public static SingletonThreadSafe getInstance(){

        if(sc==null){
            synchronized(SingletonThreadSafe.class){
                if(sc==null){
                    sc = new SingletonThreadSafe();
                }
            }
        }

        return sc;
    }
}
