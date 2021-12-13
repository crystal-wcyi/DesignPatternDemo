package com.demo.common;

import com.demo.abs.NormalBread;

public class SweetBread extends NormalBread {

	public void paint() {
		System.out.println("添加甜蜜素");
	}

	@Override
	public void kneadFlour() {
		this.paint();
		super.kneadFlour();
	}
}
