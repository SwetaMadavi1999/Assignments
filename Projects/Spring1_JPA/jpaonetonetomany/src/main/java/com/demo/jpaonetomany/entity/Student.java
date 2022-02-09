package com.demo.jpaonetomany.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int s_id;
	private String s_name;
	@OneToMany(targetEntity = Library.class)
	private List b_issue;
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
	public List getB_issue() {
		return b_issue;
	}
	public void setB_issue(List b_issue) {
		this.b_issue = b_issue;
	}
}
