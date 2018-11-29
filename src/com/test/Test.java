package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public void checkTest() {

		/*		String a="selenium";

		String b="selenium";


		if(a.equals(b))
		{
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}


	Predicate<String> p1=	Predicate.isEqual(a);
	Predicate<String> p2=	Predicate.isEqual(b);	
	Predicate<String> p3= p1.or(p2);
		if(p3.test("selenium")) {

		}*/

		List<String> l=new ArrayList<String>();

		l.add("test1");
		l.add("test2");

		l.add("test3");
		l.add("test4");
		l.add("test5");

		List<String> l1=new ArrayList<String>();

		l1.add("test2");
		l1.add("test1");
		l1.add("test3");
		l1.add("test4");
		l1.add("test5");

		System.out.println(l.containsAll(l1));
		
		
		System.out.println(l.equals(l1));
		
		Collections.sort(l1,new Comparator<T>() {

			@Override
			public int compare(T arg0, T arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		
		
		/*for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}*/

		/*l.stream().forEach(i->{
			if(i.equals("test5")) {
				System.out.println("Test Case Pass");
			}else {
				System.out.println("Test Case Fail");
			}

		})*/;


		//l.stream().forEach(System.out::println);

		//l.stream().forEach(s-> System.out.println(s));


	}


	public static void main(String[] args) {

		Test t=new Test();

		t.checkTest();


	}

}
