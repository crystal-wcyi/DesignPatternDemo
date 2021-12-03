package com.demo.factory.model;

//薯条基类
public abstract class FrenchFries extends AbstractBaseFood implements IFood {

	@Override
	public void printMessage() {
		System.out.println("--" + this.kind + "风味薯条，\t 单价：" + this.price + "，\t数量：" + this.num + "，\t合计：" + this.totalPrice());

	}

}
