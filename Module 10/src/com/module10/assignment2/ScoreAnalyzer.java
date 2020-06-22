package com.module10.assignment2;

import java.util.LinkedList;

public class ScoreAnalyzer {
	private LinkedList<Integer> runsData;

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	}
	public int addRunsToList(int runs)
	{
		LinkedList<Integer> score = new LinkedList<>();
		score.add(runs);
		return runs;
}
}
