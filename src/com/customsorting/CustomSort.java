package com.customsorting;

import java.util.*;

public class CustomSort {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(300, "Vaibhav", "Developing");
		Employee e2 = new Employee(101, "Shree", "Testing");
		Employee e3 = new Employee(202, "Rushi", "Manager");
		Employee e4 = new Employee(103, "Mukund", "Analyst");
		
		SortAscendingName cs = new SortAscendingName(); 
		SortAscendingId ii = new SortAscendingId();
		SortAscendingDept dd = new SortAscendingDept();
		TreeSet ts = new TreeSet(cs);
		ts.add(e3);
		ts.add(e2);
		ts.add(e1);
		ts.add(e4);
		
		System.out.println(ts);
	}

}
