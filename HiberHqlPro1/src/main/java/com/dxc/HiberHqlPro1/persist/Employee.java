package com.dxc.HiberHqlPro1.persist;

import javax.persistence.*;

@Entity
@Table(name="hql1")
public class Employee {
	@Id
	@Column(name="empcode" , length=10)
	private int empcode;
	@Column(name="empname" , length=10)
	private String empname;
	@Column(name="designation" , length=10)
	private String designation;
	@Column(name="basic" , length=10)
	private double basic;
	@Column(name="city" , length=10)
	private String city;
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
