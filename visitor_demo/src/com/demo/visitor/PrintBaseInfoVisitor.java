package com.demo.visitor;

import com.demo.structure.Employees;
import com.demo.structure.Manager;

public class PrintBaseInfoVisitor implements IVisitor {

	public PrintBaseInfoVisitor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visit(Manager manager) {
		System.out.print("- 管理者:");
		manager.printUserBaseInfo();
	}

	@Override
	public void visit(Employees employee) {
		System.out.print("- 一般员工:");
		employee.printUserBaseInfo();
	}

}
