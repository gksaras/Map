package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExercise {
	public static void main(String[] args) {
		Map<Integer, String> h=new HashMap<>();
		h.put(10,"java");
		h.put(20,"sql");
		h.put(30,"oops");
		h.put(40,"sql");
		h.put(50,"oracle");
		h.put(60,"DB");
		h.put(10,"selenium");
		h.put(50,"psql");
		h.put(40,"Hadoop");
		System.out.println(h);
		Set<Integer> k1 = h.keySet();
		System.out.println(k1);
		Collection<String> v1 = h.values();
		System.out.println(v1);
		Set<Entry<Integer, String>> e1 = h.entrySet();
		System.out.println(e1);
		for (Entry<Integer, String> x1 : e1) {
			System.out.println(x1);
		}
		
		Map<Integer, Integer> l=new LinkedHashMap<>();
		l.put(10, 10);
		l.put(20, 20);
		l.put(30, 30);
		l.put(40, 40);
		l.put(50, 50);
		l.put(60, 60);
		l.put(10, 10);
		l.put(50, 50);
		l.put(40, 40);
		System.out.println(l);
		Set<Integer> k2 = l.keySet();
		System.out.println(k2);
		Collection<Integer> v2 = l.values();
		System.out.println(v2);
		Set<Entry<Integer, Integer>> e2 = l.entrySet();
		System.out.println(e1);
		for (Entry<Integer, Integer> x2 : e2) {
			System.out.println(x2);
		}
		
		Map<Character, Integer> t=new TreeMap<>();
		t.put('!', 10);
		t.put('@', 20);
		t.put('#', 30);
		t.put('$', 40);
		t.put('%', 50);
		t.put('^', 60);
		t.put('&', 10);
		t.put('*', 50);
		t.put('(', 40);
		System.out.println(t);
		Set<Character> k3 = t.keySet();
		System.out.println(k3);
		Collection<Integer> v3 = t.values();
		System.out.println(v3);
		Set<Entry<Character, Integer>> e3 = t.entrySet();
		System.out.println(e3);
		for (Entry<Character, Integer> x3 : e3) {
			System.out.println(x3);
		}
		
		Map<String, String> m=new HashMap<>();
		m.put("vel", "Selenium");
		m.put("Ganesh", "framework");
		m.put("Dinesh", "oracle");
		m.put("Vengat", "core java");
		m.put("subash", "jira");
		
		/*System.out.println(m);
		Set<String> k4 = m.keySet();
		System.out.println(k4);
		Collection<String> v4 = m.values();
		System.out.println(v4);
		Set<Entry<String, String>> e4 = m.entrySet();
		System.out.println(e4);
		for (Entry<String, String> x4 : e4) {
			System.out.println(x4);*/
		for (Map.Entry<String, String> entry : m.entrySet()) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		// To iterate keys from map
		for (String name : m.keySet()) {
			System.out.println(name);
		}
		//To iterate values from map
		for (String course : m.values()) {
			System.out.println(course);
		}
		}
	}
