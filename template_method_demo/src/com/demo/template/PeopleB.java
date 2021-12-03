package com.demo.template;

public class PeopleB extends AbstractPeople {

	@Override
	protected void haveBreakfast() {
		System.out.println("B 早餐喝粥，吃小菜...");

	}

	@Override
	protected void transport() {
		System.out.println("B 乘坐公共汽车上班...");

	}

}
