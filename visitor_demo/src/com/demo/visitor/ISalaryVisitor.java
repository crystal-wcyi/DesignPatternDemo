package com.demo.visitor;

public interface ISalaryVisitor extends IVisitor {
	//统计管理者薪资情况
	public void printManagerTotalSalary();
	
	//统计一般员工薪资情况
	public void printEmployeesTotalSalary();
	
	//统计所有员工薪资情况
	public void printTotalSalary();
}
