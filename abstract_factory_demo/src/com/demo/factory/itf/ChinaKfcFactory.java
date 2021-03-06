package com.demo.factory.itf;

import com.demo.factory.model.kfc.ChinaHanBurg;
import com.demo.factory.model.kfc.ChinaChickenWings;
import com.demo.factory.model.kfc.ChinaFrenchFries;
import com.demo.factory.model.kfc.ChinaBeverage;
import com.demo.factory.model.Beverage;
import com.demo.factory.model.ChickenWings;
import com.demo.factory.model.FrenchFries;
import com.demo.factory.model.Hamburg;

public class ChinaKfcFactory implements IKfcFactory {

	public ChinaKfcFactory() {
		// TODO Auto-generated constructor stub
	}      

	//生产麻辣风味鸡腿汉堡
	@Override
	public Hamburg createHamburg(int num) {
		return new ChinaHanBurg(num);
	}
	
	//生产薯条
	@Override
	public FrenchFries createFrenchFries(int num) {
		return new ChinaFrenchFries(num);
	}

	//生产奥尔良烤鸡翅
	@Override
	public ChickenWings createChickenWings(int num) {
		return new ChinaChickenWings(num);
	}

	//生产可乐
	@Override
	public Beverage createBeverage(int num) {
		return new ChinaBeverage(num);
	}

}
