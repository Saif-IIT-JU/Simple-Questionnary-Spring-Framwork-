package com.saif;

public class Answers {
	private int id;
	private String ans;
	private String name;
	
	Answers(){}
	
	Answers(int id, String ans, String name)
	{
		this.id = id; this.ans = ans; this.name = name;
	}
	
	public String toString()
	{
		return id + " " + ans + " (answer given by " + name + ")";
	}
}
