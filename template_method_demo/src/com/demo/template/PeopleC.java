package com.demo.template;

public class PeopleC extends AbstractPeople {

	@Override
	protected void haveBreakfast() {
		System.out.println("C 早餐吃煎饼，喝豆浆...");

	}

	@Override
	protected void transport() {
		System.out.println("C 坐地铁上班...");

	}

}
