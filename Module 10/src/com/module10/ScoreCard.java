package com.module10;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ScoreCard {

	public static void main(String[] args) {
		
		TreeMap<String , Integer> score=new TreeMap<>();
		
		score.put("Rahane", 20);
		score.put("Rahul", 30);
		score.put("Kohli", 150);
		score.put("Dhoni", 50);
		score.put("Lokesh", 2);
		int total=0;
		int hscore=0;
		
		System.out.println("Playes who batted");
		for(Map.Entry<String, Integer> entry :score.entrySet()) {
			System.out.println(entry.getKey());
			total=total+entry.getValue();
		}
		System.out.println("Scores of players");
		Iterator<Map.Entry<String, Integer>> iterator=score.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String , Integer > entry =iterator.next();
			System.out.println(entry);
		}
		System.out.println("Total Score:  "+total);
		System.out.print("Name of highest Scorer--");
		for(Map.Entry<String, Integer> entry :score.entrySet()) {
			if(entry.getValue()==150) {
				System.out.print(entry.getKey());
			}
			
		}
		System.out.println();
		System.out.print("Runs scored by Dhoni--");
		for(Map.Entry<String, Integer> entry :score.entrySet()) {
			
               if(entry.getKey()=="Dhoni") {
				System.out.println(entry.getValue());
			}
		}
		
	}

	}


