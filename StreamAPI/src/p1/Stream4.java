package p1;

import java.util.List;

public class Stream4 {

	public static void main(String[] args) {
		
//		ArrayList<Object> al = new ArrayList<>();
//		
//		al.add("A"); al.add("B"); al.add("C"); al.add(1); al.add(2); al.add(3);
//		System.out.println(al);
//		
//		al.stream().filter(e -> e instanceof String).forEach(System.out::println);
//		
//		al.stream()
//					.filter(e -> e instanceof Integer)
//					.filter(e -> (Integer)e%2==1)
//					.forEach(System.out::println);
		
		//======================================================================================
		
		List<Student> list = List.of( new Student(21,"shiv","java" , 4000),
									  new Student(22,"hari","oracle" , 2500),
									  new Student(23,"ram","python" , 5000),
									  new Student(24,"ramesh","java" , 4000),
									  new Student(25,"suesh","python" , 5000),
									  new Student(26,"rahul","c++" , 3000)
									);
		
		list.stream()
			.forEach(e -> System.out.print(e.getName()+" ")); System.out.println();
//		
//		System.out.println(list.toString());
//		//print only java subject students
//		list.stream().filter(ele -> ele.getSubject().equalsIgnoreCase("java")).forEach(System.out::println);
		
		//======================================================================================
		
		List<Object> list1 = List.of("a",5,"b",6,"c",7);
		System.out.print(list1); System.out.println();
		
		list1.stream()
			.filter(e -> e instanceof String)
			.map(e -> e.toString().toUpperCase())
			.forEach(e -> System.out.print(e+" "));
		
		list1.stream()
		.filter(e -> e instanceof Integer)
		.map(e -> (int)e)
		.forEach(e -> System.out.print(e+" "));
		
		//======================================================================================
		
		
	}

}
