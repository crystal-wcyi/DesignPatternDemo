package com.demo.factory.model;

//鸡翅基类
public abstract class ChickenWings extends AbstractBaseFood implements IFood {

	@Override
	public void printMessage() {
		System.out.println("--" + this.kind + "风味鸡翅，\t 单价：" + this.price + "，\t数量：" + this.num + "，\t合计：" + this.totalPrice());
	}

}
