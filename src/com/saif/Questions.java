package com.saif;

import java.util.*;

public class Questions {
	private int id;
	private String name;
	private List<Answers>ans;
	
	Questions(){}
	Questions(int id, String name, List<Answers>ans)
	{
		this.id = id; this.name = name; this.ans = ans;
	}
	
	void display()
	{
		System.out.println("Question id : " + id);
		System.out.println("Question is : " + name);
		System.out.println("Answers are : " ) ;
		Iterator itr = ans.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
	}
}
