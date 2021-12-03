package com.demo.template;

public abstract class AbstractPeople {
	public void getUp() {
		System.out.println("起床...");
	}
	
	protected abstract void haveBreakfast();
	
	protected abstract void transport();
	
	public void doWork() {
		System.out.println("工作...");
	}
	
	//模版方法(每天的行为)
	public final void dayLift() {
		System.out.println("===================");
		//起床
		getUp();
		//吃早餐
		haveBreakfast();
		//乘坐交通工具
		transport();
		//工作
		doWork();
		
		System.out.println("===================");
	}
}
