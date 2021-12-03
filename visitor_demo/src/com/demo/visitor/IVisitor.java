package com.demo.visitor;

import com.demo.structure.*;

//访问者接口
public interface IVisitor {
	public void visit(Manager manager);
	public void visit(Employees employee);
}
