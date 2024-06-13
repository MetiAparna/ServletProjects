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
@Table(name="student_info")
public class Student implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	@Column(nullable=false,unique=true)
	private String email;
	
	@Column(nullable=false,unique=true)
	private String parent_mobile;
		
	@Column(nullable=false)
	private String Gender;
	
	@Column(nullable=false)
	private String address;
	
	@Column(nullable=false)
	private String study;
	
	@Column(name="DOB",nullable=false)
	private Date DateOfBirth;
	
	
	private int age;
	
	@Column(nullable=false)
	private String section;
	
	
	
	@Column(nullable=false)
	private String overallPercentage;
	
	@Column(nullable=false)
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getParent_mobile() {
		return parent_mobile;
	}

	public void setParent_mobile(String parent_mobile) {
		this.parent_mobile = parent_mobile;
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

	public String getStudy() {
		return study;
	}

	public void setStudy(String study) {
		this.study = study;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getOverallPercentage() {
		return overallPercentage;
	}

	public void setOverallPercentage(String overallPercentage) {
		this.overallPercentage = overallPercentage;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
