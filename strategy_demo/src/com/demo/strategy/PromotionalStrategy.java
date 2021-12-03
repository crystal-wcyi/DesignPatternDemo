package com.demo.strategy;

public class PromotionalStrategy implements IStrategy {

	@Override
	public double realPrice(double consumePrice) {
		if (consumePrice > 200) {
			return (consumePrice - 200) * 0.8 + 200;
		} else {
			return consumePrice;
		}
	}

}
