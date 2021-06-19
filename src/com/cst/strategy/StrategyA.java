package com.cst.strategy;

public class StrategyA implements Strategy {
    @Override
    public void doStuff() {
        System.out.println("Strategy algorithm A");
    }

    @Override
    public StrategyName getStrategyName() {
        return StrategyName.StrategyA;
    }
}
