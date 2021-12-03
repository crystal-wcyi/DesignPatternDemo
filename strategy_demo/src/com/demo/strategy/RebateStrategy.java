package com.demo.strategy;

public class RebateStrategy implements IStrategy {
	
	private final double rate;
	
	public RebateStrategy() {
		this.rate = 0.8;
	}

	@Override
	public double realPrice(double consumePrice) {
		return consumePrice * this.rate;
	}

}
