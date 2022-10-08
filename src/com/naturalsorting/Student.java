package com.naturalsorting;

import java.util.Objects;
// Natural sorting order

public class Student implements Comparable {
	int roll;
	String name;

	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	Student() {
		super();
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (roll == s.roll && name.equals(s.name)) {
				return true;
			}
			return false;
		}
		return false;
	}
	public int hashcode() {
		return Objects.hash(roll, name);
	}
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	public int compareTo(Object o) {
		Student s = (Student) o;
		if (this.roll == s.roll)
			return 0;
		else if (this.roll > s.roll)
			return 4; // //return -4 it will gives descending order for roll number
		else
			return -4;
	}

//	public int compareTo(Object o) {
//		Student e=(Student)o;
//		if(this.name==e.name)
//			return 0;
//		else if(this.name.compareTo(e.name)>0)
//			return 1;					//return -1 it will gives descending order for String(Alphabeticaly)
//		else
//			return -1;
//		
//	}
}