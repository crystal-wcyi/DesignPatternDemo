package com.demo.common;

import com.demo.abs.NormalBread;

public class CornBread extends NormalBread {

	public void paint() {
		System.out.println("添加柠檬黄的着色剂...");
	}
	
	@Override
	public void kneadFlour() {
		this.paint();
		super.kneadFlour();
	}

}
