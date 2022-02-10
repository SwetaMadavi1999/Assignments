package com.demo.jpacascade.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject {
private String name;
private int marks;
@Id
private int id;
public Subject(String name, int marks, int id) {
	super();
	this.name = name;
	this.marks = marks;
	this.id = id;
}
public Subject() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
