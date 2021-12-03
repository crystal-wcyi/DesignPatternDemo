package com.demo.factory.model;
//饮料基类
public abstract class Beverage extends AbstractBaseFood implements IFood {

	@Override
	public void printMessage() {
		System.out.println("--" + this.kind + "饮料，\t 单价：" + this.price + "，\t数量：" + this.num + "，\t合计：" + this.totalPrice());
	}

}
