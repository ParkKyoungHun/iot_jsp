package com.test.iot;

import java.util.HashMap;

public class Exam {
	String test = "123";
	
	public int printTest() {
		return 1;
	}
	public void test(int i) {
		if(i==0){
			return;
		}
		System.out.println("i가 0은 아니네요~");
	}

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("a1", "href=asdfasdf");
		String str = hm.get("a1");
		System.out.println(str.toString());
	}
}
