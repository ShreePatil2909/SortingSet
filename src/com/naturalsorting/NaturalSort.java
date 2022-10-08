package com.naturalsorting;
import java.util.*;
public class NaturalSort {

	public static void main(String[] args) {
		
		Student s=new Student(100,"AAA");
		Student s1=new Student(200,"BBB");
		Student s2=new Student(300,"CCC");
		Student s3=new Student(400,"AAA");
		
		TreeSet ts=new TreeSet();
		
		ts.add(s2);
		ts.add(s);
		ts.add(s3);
		ts.add(s1);
		
		System.out.println(ts);
		
	}

}
