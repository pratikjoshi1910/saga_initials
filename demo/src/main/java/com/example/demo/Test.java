package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map = new HashMap<>();

		for (int i = 0; i < 100000; i++) {
			System.out.println(i);
			map.put(i, i + 1);
			i++;
		}
		long starttime = System.currentTimeMillis();
		System.out.println("hi");
		Object x = map.get(1);
		long endtime = System.currentTimeMillis();

		System.out.println("total time " + (endtime - starttime));
	}

}
