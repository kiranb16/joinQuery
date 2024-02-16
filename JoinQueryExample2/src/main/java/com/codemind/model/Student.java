package com.codemind.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity(name="student")
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue
	int id;
	String name;
	int std;
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="s_id" ,referencedColumnName = "id")
	Subject subject;
	
	public Student() {
		
	}
	public Student(int id, String name, int std, Subject subject) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
		this.subject = subject;
	}
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
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", std=" + std + ", subject=" + subject + "]";
	}
	
}
