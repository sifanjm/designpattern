package com.cst.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StrategyFactory {

    private Map<StrategyName, Strategy> strategies;

//need IOC
/*    public StrategyFactory(Set<Strategy> strategySet) {
        createStrategy(strategySet);
    }*/

    public StrategyFactory(Strategy strategy) {
        createStrategy(strategy);
    }

    public Strategy findStrategy(StrategyName strategyName) {
        return strategies.get(strategyName);
    }

    //need IOC
    /*private void createStrategy(Set<Strategy> strategySet) {
        strategies = new HashMap();
        strategySet.forEach(
                strategy ->strategies.put(strategy.getStrategyName(), strategy));
    }*/

    private void createStrategy(Strategy strategy) {
        strategies = new HashMap();
        strategies.put(strategy.getStrategyName(), strategy);
    }
}
