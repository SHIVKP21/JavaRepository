package p1;

import java.util.List;

public class Stream3 {

	public static void main(String[] args) {
		
		List<Integer> l1 = List.of(10,45,189,56,783);
		l1.forEach(k -> System.out.print(k+" "));
		System.out.println(" ");
		
		l1.stream().filter(k -> k>100).forEach(k -> System.out.print(k+" ")); //filter()
		System.out.println(" ");
		
		l1.stream().map(k -> k*2).forEach(k -> System.out.print(k+" "));	//map()
		System.out.println(" ");
		
		l1.stream().sorted().forEach(k -> System.out.print(k+" ")); 		//sorted()
		
		System.out.println(" ");
		long count = l1.stream().sorted().count();							//count()
		System.out.print(count);
		
		

	}
}
