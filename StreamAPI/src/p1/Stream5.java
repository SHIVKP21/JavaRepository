package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5); al.add(2); al.add(20); al.add(10); al.add(13); al.add(2); al.add(20);al.add(11);al.add(54);
		System.out.println(al);
		
		//=========================filter()===========================================
		al.stream().filter(e -> e%2==0).forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//=========================Map()===========================================
		al.stream().map(e -> e*e).forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//=========================distinct()===========================================
		al.stream().distinct().forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//=========================sorted()===========================================
		al.stream().sorted().forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//=========================limit()===========================================
		al.stream().limit(4).forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//=========================skip()===========================================
		al.stream().skip(4).forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//=========================count()===========================================
		long count = al.stream().count();
		System.out.println("count : "+count);
		
		//=========================reduce()===========================================
		Integer sum = al.stream().reduce(0, (a,b)-> a+b);
		System.out.println("sum : "+sum);
		
		//=========================collect()===========================================
		List<Integer> collectedList = al.stream().map(e -> e+5).collect(Collectors.toList());
		System.out.println(collectedList);
		
		//===========================min()=========================================
		Optional<Integer> min = al.stream().min((e1,e2) -> e1.compareTo(e2));
		System.out.println("min : "+min.get());
		
		//===========================max()=========================================
		Optional<Integer> max = al.stream().max((e1,e2) -> e1.compareTo(e2));
		System.out.println("max: "+max.get());
		//===========================sorted(Comparator<t,t>)=========================================
		List<Student> studentList = List.of(   new Student(21,"shiv","java" , 4000),
				  						new Student(22,"hari","oracle" , 2500),
				  						new Student(23,"ram","python" , 5000),
				  						new Student(24,"ramesh","java" , 4000),
				  						new Student(25,"suesh","python" , 5000),
				  						new Student(26,"rahul","c++" , 3000)
									);
		
		System.out.println(studentList);
		
		System.out.println("after sorting by name");
		
		List<Student> listSortedByName = studentList.stream()
										 .sorted((e1,e2) -> e1.getName().compareTo(e2.getName()))
										 .collect(Collectors.toList());
		System.out.println(listSortedByName);
		
		
		
		
		
	}

}
