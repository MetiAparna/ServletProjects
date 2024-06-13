package com.entityclasses;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="teacher_info")
public class Teacher implements Serializable
{
	/*
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_num")
	private String phone;
	
	@Column(name="joining_date")
	private Date joiningDate;
	
	@Column(name="gender")
	private String Gender;
	
	@Column(name="address")
	private String address;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="expiriance")
	private String expiriance;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="classteacher")
	private String classTeacher;
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="password")
	private String password;
	*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	@Column(nullable=false,unique=true)
	private String email;
	
	@Column(nullable=false,unique=true)
	private String phone;
	
	@Column(name="joining_date",nullable=false)
	private Date joiningDate;
	
	@Column(nullable=false)
	private String Gender;
	
	@Column(nullable=false)
	private String address;
	
	@Column(nullable=false)
	private String qualification;
	
	private String experience;
	
	@Column(nullable=false)
	private String subject;
	
	@Column(nullable=false)
	private String classTeacher;
	
	@Column(nullable=false)
	private String salary;
	
	@Column(nullable=false)
	private String password;

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getExpiriance() {
		return experience;
	}
	public void setExpiriance(String expiriance) {
		this.experience = expiriance;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}







}
