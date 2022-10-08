package com.customsorting;

import java.util.Comparator;

public class SortAscendingId implements Comparator {

	public int compare(Object o1, Object o2) {
		
		Employee emp1=(Employee)o1;
		Employee emp2=(Employee)o2;
		
		return emp1.id.compareTo(emp2.id);
	}

}