package com.demo.structure;

import com.demo.visitor.IVisitor;

public class Employees extends Staff {

	public Employees(String no, String name, String position, float salary) {
		super(no, name, position, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Staff staff) {

	}

	@Override
	public Staff remove(String no) {
		return null;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);;
	}

}
