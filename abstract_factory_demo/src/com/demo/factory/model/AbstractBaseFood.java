package com.demo.factory.model;

//产品基类
public abstract class AbstractBaseFood {
	//类别
	protected String kind;
	//数量
	protected int num;
	//价格
	protected float price;
	
	public float totalPrice() {
		return this.num * this.price;
	}
}
