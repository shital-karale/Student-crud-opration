package com.student.entity;

import jakarta.persistence.*;

@Entity
@Table()
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String course;
	@Column
	private String division;
	
	
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", course=" + course + ", division=" + division + "]";
	}
	public Student(String name, String course, String division) {
		super();
		this.name = name;
		this.course = course;
		this.division = division;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}