package p1;
import java.util.*;
import java.util.stream.*;

public class Stream1 {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(5,8,9,8,6,78,91,56);
		System.out.println(l1);
		
		List<Integer> l2 = List.of(12,86,89,7645);
		
		
		List<Integer> l11 = l1.stream().filter(k->k%2==0).collect(Collectors.toList());
		System.out.println(l11);
		
		List<Integer> l21 = l2.stream().map(k->k*2).collect(Collectors.toList());
		System.out.println(l2);
		System.out.println(l21);
		
		
	}
}
