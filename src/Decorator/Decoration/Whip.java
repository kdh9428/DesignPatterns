package Decorator.Decoration;

import Decorator.Starbuck.Beverage;

public class Whip extends Beverage {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", 휘핑 크림";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
