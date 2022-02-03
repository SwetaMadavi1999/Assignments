package com.sample.demojpaentitydelete.entity;


	import javax.persistence.Entity;

	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="student")
	public class StudentEntity {
		@Id
	private int S_id;
	private String S_name;
	private int S_age;
	public StudentEntity() {}
	public StudentEntity(int s_id, String s_name, int s_age) {
		super();
		this.S_id = s_id;
		this.S_name = s_name;
		this.S_age = s_age;
	}
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		this.S_id = s_id;
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		this.S_name = s_name;
	}
	public int getS_age() {
		return S_age;
	}
	public void setS_age(int s_age) {
		this.S_age = s_age;
	}
	}

