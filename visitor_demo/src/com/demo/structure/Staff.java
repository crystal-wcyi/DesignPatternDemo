package com.demo.structure;

import com.demo.visitor.IVisitor;
public abstract class Staff {
	//员工号
	protected String no;
	//职工姓名
	protected String name;
	//职位
	protected String position;
	//薪资
	protected double salary;
	
	//私有属性，长度字符串
	private int length;
	
	//构造方法
	public Staff(String no, String name, String position, double salary) {
		this.no = no;
		this.name = name;
		this.position = position;
		this.salary = salary;
		
		//计算总字节长度
		this.length += (no == null || "".equals(no.trim())) ? 0 : no.getBytes().length;
		this.length += (name == null || "".equals(name.trim())) ? 0 : name.getBytes().length;
		this.length += (position == null || "".equals(position.trim())) ? 0 : position.getBytes().length;
		this.length += String.valueOf(salary).getBytes().length;
	}
	
	//获得员工基本信息
	public void printUserBaseInfo() {
		System.out.println("-|" + this.no + " " + this.name + " " + this.position + " " + this.salary);
	}
	
	public abstract void add(Staff staff);
	
	public abstract Staff remove(String no);
	
	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//接收访问者对象
	public abstract void accept(IVisitor visitor);

}
