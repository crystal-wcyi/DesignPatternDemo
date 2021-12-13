package com.demo.decorator;

import com.demo.abs.IBread;

public class SweetDecorator extends AbstractBread {

	public SweetDecorator(IBread bread) {
		super(bread);
	}

	public void paint() {
		System.out.println("添加甜蜜素...");
	}
	
	@Override
	public void kneadFlour() {
		this.paint();
		super.kneadFlour();
	}
}
