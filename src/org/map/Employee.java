package org.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Employee extends Detail{

	public static void main(String[] args) {
		
		Map<String, Employee> m=new HashMap<String, Employee>();
		
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("Joseph");
		e1.setEmail("joseph@gmail.com");
		
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("James");
		e2.setEmail("james@gmail.com");
		
		Employee e3 = new Employee();
		e3.setId(103);
		e3.setName("Strange");
		e3.setEmail("strange@gmail.com");
		
		Employee e4 = new Employee();
		e4.setId(104);
		e4.setName("Rogera");
		e4.setEmail("rogers@gmail.com");
		
		Employee e5 = new Employee();
		e5.setId(105);
		e5.setName("Barnes");
		e5.setEmail("barnes@gmail.com");
		
		m.put("emp1", e1);
		m.put("emp2", e2);
		m.put("emp3", e3);
		m.put("emp4", e4);
		m.put("emp5", e5);
		
		Set<Entry<String,Employee>> es = m.entrySet();
		for (Entry<String, Employee> e : es) {
			System.out.println(e.getKey());
			System.out.println(e.getValue().getId());
			System.out.println(e.getValue().getName());
			System.out.println(e.getValue().getEmail());
		}
	}
}
