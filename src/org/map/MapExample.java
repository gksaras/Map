package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
/* Map:
   => interface under java.util package
   => key,value pair combination
   => key does not allow duplicates,eg:[empId]->key
   => value allows duplicates,eg:[empName]->value
   
   Types of Map:
   1.HashMap(Random) key=1 null, value=n null
   2.LinkedHashMap(insertion) key=1 null, value=n null
   3.TreeMap(ascending) key=ignore null, value=n null
   4.HashTable(Random) key=ignore null, value=ignore
   
   Methods of Map:
   => put() - insert data(key,value)
   => keySet() - print keys returns as a Set 
   => values() - print values returns as a Collection 
   => entrySet() --> getKey(),getValue()
   		=>getKey() - prints keys only
   		=>getValue() - prints values only
   => containsKey(),containsValue()
 */
public class MapExample {
	public static void main(String[] args) {
		
//Interface(Map)<Key,Value> reffName=new HashMap(class)<>();
		Map<Integer,String> m=new HashMap<>();
		m.put(10, "java");
		m.put(20, "python"); // ignores the key value
		m.put(20, "selenium"); // displays last inserted value
		m.put(30, "SQL");
		m.put(40, "AWS");
		m.put(50, "Testinng");
		m.put(60, "java");
		System.out.println(m);
		
		int s = m.size();
		System.out.println(s);
		   
		boolean ck = m.containsKey(10);
		System.out.println(ck);
		
		boolean cv = m.containsValue("java");
		System.out.println(cv);
		
		Set<Integer> k=m.keySet(); //prints key returns set
		System.out.println(k);
		for (Integer integer : k) {
			System.out.println(integer);
		}
		// returns collection
		Collection<String> v = m.values(); //prints values
		System.out.println(v);
		for (String string : v) {
			System.out.println(string);
		}
		System.out.println();
		 
		/*for (Map.Entry<Integer, String> e : m.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}*/
		
		// to print key value pair combination
		Set<Entry<Integer, String>> es = m.entrySet(); //returns set
		System.out.println(es);
		
		for (Entry<Integer, String> x : es) {
			System.out.println(x);
		}
		
		for (Entry<Integer, String> y : es) {
			System.out.println(y.getKey());
			System.out.println(y.getValue());
		}
		
		//Tree Map
	/*	Map<Character, Integer> m1=new TreeMap<>();
		m1.put('!', 10);
		m1.put('@', 20);
		m1.put('#', 30);
		m1.put('$', 40);
		m1.put('%', 50);
		m1.put('^', 60);
		m1.put('&', 10);
		m1.put('*', 50);
		m1.put('(', 409);
		System.out.println(m1);
		//Printing keys only on map in the list form
		Set<Character> k1 = m1.keySet();
		System.out.println(k1);
		//Printing values only on map in the list form
		Collection<Integer> v1 = m1.values();
		System.out.println(v1);
		//Converting Map into entry set
		Set<Entry<Character, Integer>> e1 = m1.entrySet();
		System.out.println(e1);
		//iterate over enhanced for loop key value pair combination
		for (Entry<Character, Integer> x1 : e1) {
			System.out.println(x1);
		}
		//iterate for each loop for separate keys and values
		for (Entry<Character, Integer> en : e1) {
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		
		//Hash Table
		Map<Integer, String> m2=new Hashtable<>();
		m2.put(101, "Albert");
		m2.put(102, "Bucky");
		m2.put(103, "Cedric");
		m2.put(104, "Dean");
		m2.put(105, "Edward");
		System.out.println(m2);
		for (Map.Entry<Integer, String> e2 : m2.entrySet()) {
			System.out.println(e2.getKey());
			System.out.println(e2.getValue());
		}
	*/
	}
}
