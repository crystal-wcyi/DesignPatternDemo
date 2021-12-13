package com.demo.decorator;

import com.demo.abs.IBread;

public class CornDecorator extends AbstractBread {

	public CornDecorator(IBread bread) {
		super(bread);
	}
	
	public void paint() {
		System.out.println("添加柠檬黄的着色剂...");
	}
	
	@Override
	public void kneadFlour() {
		this.paint();
		super.kneadFlour();
	}

}
