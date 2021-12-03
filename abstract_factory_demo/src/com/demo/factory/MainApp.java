package com.demo.factory;

import com.demo.factory.custom.Customer;
import com.demo.factory.itf.ChinaKfcFactory;
import com.demo.factory.itf.IKfcFactory;

//抽象工厂模式 实现
public class MainApp {

	public static void main(String[] args) {
		
		IKfcFactory kfcFactory = new ChinaKfcFactory();
		
		Customer customer = new Customer(kfcFactory);
		
		float hamburgMoney = customer.orderHamburg(1);
		float chickenWingsMoney = customer.orderChickenWings(4);
		float frenchFriesMoney = customer.orderFrenchFries(1);
		float beverageMoney = customer.orderBeverage(2);
		
		System.out.println("总计:" + (hamburgMoney + chickenWingsMoney + frenchFriesMoney + beverageMoney));

	}

}
