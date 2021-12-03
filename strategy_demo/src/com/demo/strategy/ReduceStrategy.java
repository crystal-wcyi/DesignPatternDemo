package com.demo.strategy;

public class ReduceStrategy implements IStrategy {

	@Override
	public double realPrice(double consumePrice) {
		if (consumePrice >= 1000) {
			return consumePrice - 200;
		} else {
			return consumePrice;
		}
	}

}
