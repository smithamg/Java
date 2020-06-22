package com.module10;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class State {

	public static void main(String[] args) throws Exception 
	{

		File file = new File("C:\\Users\\smitha\\eclipse-workspace\\Module 10 Assignment 6\\src\\statelist.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));


		LinkedHashSet<String> stateSet = new LinkedHashSet<String>();
		String st;
		     
		       while ((st = br.readLine()) != null)
		       {
		        stateSet.add(st);
		       
		       
		       }
		       System.out.println(stateSet);
		       System.out.println( "Total number of states  " + stateSet.size());
		      Boolean check=stateSet.remove("Delhi");
		     
		       System.out.println("Removed Delhi" );
		       System.out.println(stateSet);
		       TreeSet<String> treeSet = new TreeSet<String>(stateSet);
		       System.out.println("States name sorted");
		       System.out.println(treeSet);
		       System.out.println("States name starting with K");
		     for(String kap:treeSet)
		     {
		     char ko= kap.charAt(0);
		     if(ko=='K')
		     {
		     System.out.println(kap);  
		     }
		     
		             }
		   
		      }
		   
		       
		

	}

