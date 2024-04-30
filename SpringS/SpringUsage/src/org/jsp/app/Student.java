package org.jsp.app;
import java.util.List;

public class Student {
 private int rollNo;
 private String name;
 private College clg;
 private List<String> subjects;
 
public Student(int rollNo, String name, College clg) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.clg = clg;
}

public Student(int rollNo, String name, College clg, List<String> subjects) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.clg = clg;
	this.subjects = subjects;
}

public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public College getClg() {
	return clg;
}
public void setClg(College clg) {
	this.clg = clg;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", clg=" + clg + ", subjects=" + subjects + "]";
}

}
