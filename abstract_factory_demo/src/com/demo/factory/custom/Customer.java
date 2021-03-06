package com.demo.factory.custom;

import com.demo.factory.itf.*;
import com.demo.factory.model.*;

public class Customer {

	//抽象工厂
	private IKfcFactory kfcFactory;
	//构造方法将抽象工厂作为参数传入
	public Customer(IKfcFactory kfcFactory) {
		this.kfcFactory = kfcFactory;
	}
	
	/**
	 * 订购食物
	 */
	//订购麻辣鸡腿汉堡
	public float orderHamburg(int num) {
		Hamburg hamburg = kfcFactory.createHamburg(num);
		hamburg.printMessage();
		return hamburg.totalPrice();
	}
	
	//订购奥尔良烤鸡翅
	public float orderChickenWings(int num) {
		ChickenWings chickenWings = kfcFactory.createChickenWings(num);
		chickenWings.printMessage();
		return chickenWings.totalPrice();
	}
	
	//订购薯条
	public float orderFrenchFries(int num) {
		FrenchFries frenchFries = kfcFactory.createFrenchFries(num);
		frenchFries.printMessage();
		return frenchFries.totalPrice();
	}
	
	//订购可乐
	public float orderBeverage(int num) {
		Beverage beverage = kfcFactory.createBeverage(num);
		beverage.printMessage();
		return beverage.totalPrice();
	}
	

}
