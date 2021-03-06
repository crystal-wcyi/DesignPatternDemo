package com.demo;

import com.demo.structure.*;
import com.demo.visitor.*;

public class Client {

	public static void main(String[] args) {
		
		Staff boss = new Manager("1", "大老板", "CEO", 100000);
		
		Staff financeManager = new Manager("11", "张宗", "财务部经理", 60000);
		
		Staff personnelManager = new Manager("12", "王源", "人事部经理", 60000);
		
		Staff technicalManager = new Manager("13", "陈宇", "技术部经理", 60000);
		
		Staff deptAssistant = new Manager("1301", "刘助理", "部门助理", 20000);
		
		Staff deptManager1 = new Manager("1302", "主管1", "技术主管", 30000);
		
		Staff softwareEngineer1 = new Employees("1302001", "张数", "软件工程师", 5000);
		
		Staff softwareEngineer2 = new Employees("1302002", "李斯", "软件工程师", 5600);
		
		Staff softwareEngineer3 = new Employees("1302003", "王石", "软件工程师", 5400);
		
		
		deptManager1.add(softwareEngineer1);
		deptManager1.add(softwareEngineer2);
		deptManager1.add(softwareEngineer3);

		Staff deptManager2 = new Manager("1303", "主管2", "技术主管", 30000);
		
		technicalManager.add(deptAssistant);
		technicalManager.add(deptManager1);
		technicalManager.add(deptManager2);
	
		Staff marketingManager = new Manager("14", "吴总", "市场部经理", 60000);
		
		boss.add(financeManager);
		boss.add(personnelManager);
		boss.add(technicalManager);
		boss.add(marketingManager);
		
//		boss.printUserBaseInfo();
//		
		boss.accept(new PrintBaseInfoVisitor());
		
		SalaryVisitor visitor = new SalaryVisitor();
		boss.accept(visitor);
		visitor.printManagerTotalSalary();
		visitor.printEmployeesTotalSalary();
		visitor.printTotalSalary();
	}

}
