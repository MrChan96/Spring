package com.km.demo1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private String name;
	private Bicycle bicycle;
	private List<String> subject;
	private Map<String, String> score;
	private Set interest;
	private String[] arrs;
	private Properties pro;

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBicycle(Bicycle bicycle) {
		this.bicycle = bicycle;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	public void setScore(Map<String, String> score) {
		this.score = score;
	}

	public void setInterest(Set interest) {
		this.interest = interest;
	}

	public Student(String name, Bicycle bicycle) {
		super();
		this.name = name;
		this.bicycle = bicycle;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", bicycle=" + bicycle + ", subject=" + subject + ", score=" + score
				+ ", interest=" + interest + ", arrs=" + Arrays.toString(arrs) + ", pro=" + pro + "]";
	}


}
