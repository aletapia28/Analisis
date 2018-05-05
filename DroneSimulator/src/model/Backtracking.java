package model;


import java.util.ArrayList;
import java.util.HashMap;

import controller.Timeline;

public class Backtracking extends Algorithm {
	
	protected Timeline timeline;
	ArrayList <travel> travels;
	
	public void Backtracking(Timeline timeline, ArrayList <travel> travels) {
		this.timeline=timeline;
		this.travels= travels;
	}
	
	public void BacktrakingGenerator() {
		for(int i=0;i<travels.size();i++) {
			
			if(timeline.ocupated(travels.get(i).Destino, slot))
			
		}
	}
	
	
	
		
}
