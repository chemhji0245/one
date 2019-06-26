package com.accp.entity;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
	private Integer sid;
	private String sname;
	private Integer age;
	private Date birthday;
	public Student() {
		super();
	}
	public Student(Integer sid, String sname, Integer age, Date birthday) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.birthday = birthday;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}	
