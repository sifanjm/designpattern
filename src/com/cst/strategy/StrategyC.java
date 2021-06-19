package com.cst.strategy;

public class StrategyC implements Strategy {
    @Override
    public void doStuff() {
        System.out.println("Strategy algorithm C");
    }

    @Override
    public StrategyName getStrategyName() {
        return StrategyName.StrategyC;
    }
}
