package com.cg.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	@Value("Piyush")
	private String empName;
	@Autowired
	private Project pro;
	public void getData() {
		System.out.println("Welcome to my spring core project!!! " + this.empName );
		System.out.println(this.pro.getProjId());
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Project getPro() {
		return pro;
	}

	public void setPro(Project pro) {
		this.pro = pro;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private String empName;
//	private Set<Project> empProject;
//	private List<Department> empDept;
//	private int empId;
//	
//	public Employee() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	public Employee(String empName, int empId) {
//		super();
//		this.empName = empName;
//		this.empId = empId;
//	}
//
//	public void setEmpDept(List<Department> empDept) {
//		this.empDept = empDept;
//	}
//
//	public void getData() {
//		System.out.println("Hi! Welcome to Spring Core!!! " + this.empName + " " + this.empId);
//		this.empProject.forEach(proj ->{
//			proj.getData();
//		});
//		this.empDept.forEach(dept ->{
//			System.out.println(dept.getDeptId());
//		});
//	}
//	
//	public void callFirst() {
//		System.out.println("Call First Method");
//	}
//	
//	public void callLast() {
//		System.out.println("Call Last Method");
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//	public void setEmpProject(Set<Project> empProject) {
//		this.empProject = empProject;
//	}

	
}
