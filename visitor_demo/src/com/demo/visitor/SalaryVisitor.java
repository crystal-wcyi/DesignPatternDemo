package com.demo.visitor;

import com.demo.structure.Employees;
import com.demo.structure.Manager;

public class SalaryVisitor implements ISalaryVisitor {
	//管理者薪资总和
	private float managerSalary;
	
	//普通员工薪资总和
	private float employeesSalary;

	public SalaryVisitor() {
		managerSalary = 0;
		employeesSalary = 0;
	}

	@Override
	public void visit(Manager manager) {
		managerSalary += manager.getSalary();
	}

	@Override
	public void visit(Employees employee) {
		employeesSalary += employee.getSalary();
	}

	@Override
	public void printManagerTotalSalary() {
		System.out.println("管理者薪资总和: " + managerSalary);
	}

	@Override
	public void printEmployeesTotalSalary() {
		System.out.println("一般员工薪资总和: " + employeesSalary);
	}

	@Override
	public void printTotalSalary() {
		System.out.println("员工薪资总和: " + (managerSalary + employeesSalary));
	}

}
