package com.module10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class StudentMarks {

	public static void main(String[] args) {



		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of student-----");
		int n=sc.nextInt();
		
		ArrayList studentmarks = new ArrayList();
		System.out.println("Enter the marks of student-----");
		for (int i = 0; i <n; i++) {
			studentmarks.add(sc.nextInt());//adding  the input from user
		}
		int max=(int) 
		Collections.max(studentmarks);
		System.out.println("Highest "+max);
		int total=0;
		for(int i=0;i<n;i++) {
			int num=(int)studentmarks.get(i);
			total=total+num;
		}
		double average=0.0;
		average=total/n;
		System.out.println("Average "+average);
		int third=(int)studentmarks.get(2);
		System.out.println("3rd Student Marks "+third);
		
		
		Iterator iterator =studentmarks.iterator();
		System.out.print("Marks ");
		int i=1;
		int j=1;
		while(iterator.hasNext()) {
			
			int c=(int) iterator.next();
			System.out.print(i+"-"+c+" ");
			i++;
		}
		Collections.sort(studentmarks);
		System.out.println();
		System.out.print("Sorted ");
		
       for(Object o:studentmarks) {
    	   System.out.print(j+"-"+o+" ");
    	   j++;
       }
	}
}
		

	
