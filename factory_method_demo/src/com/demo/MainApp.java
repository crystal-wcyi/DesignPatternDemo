package com.demo;

import com.demo.factory.CaoCao;
import com.demo.factory.itf.ISwordFactory;
import com.demo.factory.model.AbstractSword;

public class MainApp {

	public static void main(String[] args) {

		ISwordFactory swordFactory = new CaoCao();
		
		AbstractSword sword = swordFactory.creatSword();
		
		System.out.println("曹操使用" + sword.getName() + "刺杀董卓！");
	}

}
