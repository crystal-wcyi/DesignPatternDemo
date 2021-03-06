package com.demo.context;
import java.math.BigDecimal;
import java.math.RoundingMode;

import com.demo.strategy.IStrategy;

//策略模式
public class Context {
	//当前策略
	private IStrategy strategy;
	
	//设置当前策略
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	//使用策略计算价格
	public double cul(double consumePrice) {
		double realPrice = this.strategy.realPrice(consumePrice);
		//格式化保留小数点后1位，即精确到角
		BigDecimal bd = new BigDecimal(realPrice);
		bd = bd.setScale(1, RoundingMode.DOWN);
		
		return bd.doubleValue();
	}
	
}
