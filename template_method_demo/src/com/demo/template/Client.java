package com.demo.template;

//模版方法模式 
public class Client {

	public static void main(String[] args) {
		
		AbstractPeople peopleA = new PeopleA();
		AbstractPeople peopleB = new PeopleB();
		AbstractPeople peopleC = new PeopleC();
		
		//展示三个人每天的行为
		peopleA.dayLift();
		peopleB.dayLift();
		peopleC.dayLift();
		
	}

}
