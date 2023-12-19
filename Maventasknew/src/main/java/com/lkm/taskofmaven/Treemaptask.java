package com.lkm.taskofmaven;

import java.util.Map;
import java.util.TreeMap;

public class Treemaptask 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
		treemap.put(98,"Akhil");
		treemap.put(96,"Sushanth");
		treemap.put(92,"Sanjay");
		treemap.put(99,"Saketh");
		treemap.put(95,"Ravi");
		for(Map.Entry<Integer,String> m1:treemap.entrySet())
		{
			System.out.println(m1.getKey()+"="+m1.getValue());
		}
		System.out.println(treemap);
		treemap.remove(99);
		System.out.println(treemap);
	}
}