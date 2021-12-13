package com.demo.abs;

public class NormalBread implements IBread {

	public NormalBread() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepair() {
		System.out.println("准备面粉、水以及酵母粉...");

	}

	@Override
	public void kneadFlour() {
		System.out.println("和面...");
	}

	@Override
	public void steamed() {
		System.out.println("蒸馒头...香喷喷的馒头出炉了！");
	}

	@Override
	public void process() {
		prepair();
		kneadFlour();
		steamed();
	}

}
