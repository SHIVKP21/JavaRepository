package p1;

import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		
		List<Integer> l1 = List.of(45,15,30,40,50,75);
		System.out.println(l1);
		
		List<Integer> l2 = l1.stream().filter(k -> (k%15)==0).collect(Collectors.toList());
		System.out.println(l2);
		

	}

}
