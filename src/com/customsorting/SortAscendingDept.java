package com.customsorting;

import java.util.Comparator;

public class SortAscendingDept implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.dept.compareTo(e2.dept);
	}
	
}
