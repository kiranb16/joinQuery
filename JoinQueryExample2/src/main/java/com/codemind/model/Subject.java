package com.codemind.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="subject")
@Table(name="subject")
public class Subject {
	@Id
   int s_id;
   String s_name;
   
public Subject() {
	//super();
}
public Subject(int s_id, String s_name) {
	super();
	this.s_id = s_id;
	this.s_name = s_name;
}
public int getS_id() {
	return s_id;
}
public void setS_id(int s_id) {
	this.s_id = s_id;
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
@Override
public String toString() {
	return "Subject [s_id=" + s_id + ", s_name=" + s_name + "]";
}
   
   
}
