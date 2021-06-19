package com.cst.strategy;

public class StrategyB implements Strategy {
    @Override
    public void doStuff() {
        System.out.println("Strategy algorithm B");
    }

    @Override
    public StrategyName getStrategyName() {
        return StrategyName.StrategyB;
    }
}
