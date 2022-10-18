package com.single_inheritance;

public class Pojo_A {
	
	 private String studentname;
	 private int studentid;
	 private long studentphnno;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public long getStudentphnno() {
		return studentphnno;
	}
	public void setStudentphnno(long studentphnno) {
		this.studentphnno = studentphnno;
	}
	public Pojo_A() {
		super();
	}
	public Pojo_A(String studentname, int studentid, long studentphnno) {
		super();
		this.studentname = studentname;
		this.studentid = studentid;
		this.studentphnno = studentphnno;
	}
	
	 
	
	}


