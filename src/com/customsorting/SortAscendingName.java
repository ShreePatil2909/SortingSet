package com.customsorting;

import java.util.*;

public class SortAscendingName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);     
	}
	
//	public int compare(Employee e1, Employee e2) {
//		return -e1.name.compareTo(e2.name);     //for descending order
//	}
	
}