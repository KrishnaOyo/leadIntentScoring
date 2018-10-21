package com.oyo.leadIntentScoring.models;

public class ScoreAttributes {
	String name;
	String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public ScoreAttributes(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("ScoreAttributes {: ");
		sb.append("name : " ).append(name).append("'\'");
		sb.append(", dept : ").append(dept).append("'\'");
		sb.append("}");
		return sb.toString();
				
	}
}
