package com.demo.template;

public class PeopleA extends AbstractPeople {

	@Override
	protected void haveBreakfast() {
		System.out.println("A 早餐吃三明治，喝牛奶...");

	}

	@Override
	protected void transport() {
		System.out.println("A 开私家车上班...");

	}

}
