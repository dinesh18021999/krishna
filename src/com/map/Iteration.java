package com.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Iteration {
	
	public static void main(String[] args) {
		 Map<String, Integer> li=new LinkedHashMap<>() ;
		li.put("dinesh", 24);
        li.put("priyanka", 23);
        li.put("supriya", 23);
        li.put("deepak", 20);
	 
			Set<String> keySet = li.keySet();
			System.out.println(keySet);
			
			
			Collection<Integer> values = li.values();
			System.out.println(values);
			
			Set<Entry<String, Integer>> entrySet = li.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
				System.out.println(entry);
				
			}
			}
	}

