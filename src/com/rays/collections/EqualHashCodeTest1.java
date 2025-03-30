package com.rays.collections;

import java.util.*;

public class EqualHashCodeTest1 {
	public static void main(String[] args) {
		EqualHashCode e = new EqualHashCode(100, "Harash", 500);
		EqualHashCode e1 = new EqualHashCode(100, "Harsh", 500);
		EqualHashCode e2 = new EqualHashCode(2, "Harsh", 100);
		EqualHashCode e3 = new EqualHashCode(100, "Harsh", 500);

		//Remove me sab me equal method run hoti he..
		System.out.println("---------LIST----------------");
		
		List l = new ArrayList();
		l.add(e);
		l.add(e1);
		l.add(e2);
		System.out.println("adding in List  :" + l);

		l.remove(e3);
		// l.remove(e1);
		System.out.println("removing in List :" + l);

		System.out.println("---------SET----------------");
		Set s = new HashSet();
		s.add(e);
		s.add(e1);
		s.add(e2);
		System.out.println("add in set :" + s);

		s.remove(e3);// add nhi kiya he ye object but eska hash code and equal method seam he e and
						// e1 se.
		System.out.println("remove in set" + s);

		System.out.println("--------------MAP------------");
		Map m = new HashMap();

		m.put(e, 1);
		m.put(e1, 2);
		m.put(e2, 3);
		System.out.println("add In map" + m);

		m.remove(e3);
		System.out.println("Remove in map" + m);
	}
}
