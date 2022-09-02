package com.map;

import java.util.*;

public class MapPractice 
{public static void main(String[] args) {
	
	Map<String,Integer> m=new HashMap(); //random order
	m.put("CSK", 20);
	m.put("mi", 4);
	m.put("RR", 16);
	m.put("KKR", 12);
	m.put("DC", 10);
	m.put(null, null);
	m.put("RCB", null);
	m.put("CSK", 18);
	m.put(null, 2);
	m.put("pb", null);
	
	
	
	
	System.out.println(m);
	
	
	Map<String,Integer> n=new LinkedHashMap();
	n.put("CSK", 20);
	n.put("mi", 4);
    n.put("RR", 16);
	n.put("KKR", 12);
	n.put("DC", 10);
	n.put(null, null);
	n.put("RCB", null);
	n.put("CSK", 18);
	n.put(null, 2);
	n.put("pb", null);
	
	System.out.println(n);
	
	
	Map<String,Integer> K=new TreeMap();
	
	K.put("CSK", 20);
	K.put("mi", 4);
	K.put("RR", 16);
	K.put("KKR", 12);
	K.put("DC", 10);
	K.put("RCB", null);
	K.put("CSK", 18);
	K.put("pb", null);
	
	System.out.println(K);
	
	Map<String,String> g=new Hashtable();
	
	
	g.put("CSK", "csk");
	g.put("mi", "db");
	g.put("RR", "sd");
	g.put("KKR", "nm");
    g.put("CSK", "jk");
	
	
	System.out.println(g);
	
	int size = g.size();
	System.out.println(size);
	
	Integer integer = K.get("RR");
	System.out.println(integer);
	
	
	boolean containsKey = K.containsKey("PB");
	System.out.println(containsKey);
	
  boolean containsValue = g.containsValue("jk");
	
	System.out.println(containsValue);
	
	String remove = g.remove("KKR");
	System.out.println(remove);
	System.out.println(g);
	
	Set<String> keySet = g.keySet();
	System.out.println(keySet);
	
	Collection<String> values = g.values();
	System.out.println(values);
	
	
	
	
	
	
	
	
	
			
}

}
