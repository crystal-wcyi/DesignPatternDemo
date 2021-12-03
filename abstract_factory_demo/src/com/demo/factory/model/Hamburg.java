package com.demo.factory.model;

//汉堡基类
public abstract class Hamburg extends AbstractBaseFood implements IFood {

	public Hamburg() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printMessage() {
		System.out.println("--" + this.kind + "风味汉堡，\t 单价：" + this.price + "，\t数量：" + this.num + "，\t合计：" + this.totalPrice());
	}

}
