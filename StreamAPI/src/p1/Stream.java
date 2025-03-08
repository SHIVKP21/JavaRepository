package p1;

import java.util.ArrayList;

public class Stream {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		ArrayList<String> uqAL = new ArrayList<>();
		
		al.add("A"); al.add("B"); al.add("C"); al.add("A"); al.add("B"); al.add("D");
		System.out.println(al);
		
//		Remove duplicate elements before java8
//		for(String str : al) {		
//			if(!uqAL.contains(str)) { uqAL.add(str); }
//		}
//		System.out.println(uqAL);
		
		al.stream().distinct().forEach(k -> System.out.print(k+" "));
	}

}
