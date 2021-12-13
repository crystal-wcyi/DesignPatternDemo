package com.demo;

import com.demo.abs.IBread;
import com.demo.abs.NormalBread;
import com.demo.common.CornBread;
import com.demo.common.SweetBread;

import com.demo.decorator.CornDecorator;
import com.demo.decorator.SweetDecorator;

public class ClientApp {

	public static void main(String[] args) {

		System.out.println("======开始生产正常馒头...");
		
		IBread normalBread = new NormalBread();
		normalBread.process();
		
		System.out.println("======正常馒头生产结束...");
		
		System.out.println("======开始生产染色的玉米馒头...");
		
		IBread normalBread2 = new CornBread();
		normalBread2.process();

		System.out.println("======染色的玉米馒头生产结束...");
	

		System.out.println("======开始生产甜蜜素馒头...");
		
		IBread normalBread3 = new SweetBread();
		normalBread3.process();
		
		System.out.println("======开始生产染色的玉米馒头...");
		
		
		//生产装饰馒头
		System.out.println("\n======开始装饰馒头！");
		
		IBread normalB = new NormalBread();
		//下面就开始对正常馒头进行装饰
		//使用柠檬黄对着色剂装饰馒头
		normalB = new CornDecorator(normalB);
		//使用甜蜜素装饰馒头
		normalB = new SweetDecorator(normalB);
		normalB.process();
		System.out.println("======装饰馒头结束！");
	}

}
