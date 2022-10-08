package com.customsorting;
import java.util.*;

import java.util.Objects;

public class Employee  {
	
	Integer id;
	String name;
	String dept;
	Employee(int id,String name,String dept){
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
	Employee(){
		super();
	}
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj instanceof Employee) {
			Employee ee = (Employee)obj;
			if(id==ee.id && name.equals(ee.name) && dept.equals(ee.dept));
			return true;
		}
		else
			return false;
	}
	public int hashCode() {
		return Objects.hash(id,name,dept);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}