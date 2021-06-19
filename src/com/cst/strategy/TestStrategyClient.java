package com.cst.strategy;

public class TestStrategyClient {
    public static void main(String[] args) {

        StrategyFactory strategyFactory = new StrategyFactory(new StrategyA());
        strategyFactory.findStrategy(StrategyName.StrategyA).doStuff();

        strategyFactory = new StrategyFactory(new StrategyB());
        strategyFactory.findStrategy(StrategyName.StrategyB).doStuff();

        strategyFactory = new StrategyFactory(new StrategyC());
        strategyFactory.findStrategy(StrategyName.StrategyC).doStuff();


    }
}
