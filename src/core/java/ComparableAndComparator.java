package core.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ComparableAndComparator {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		arrayList.add(new Student("sree", 20));
		arrayList.add(new Student("bbr", 25));
		arrayList.add(new Student("vijaya", 22));
		arrayList.add(new Student("anu", 19));
		arrayList.add(new Student("karthi", 26));
		arrayList.add(new Student("janani", 24));
		arrayList.add(new Student("shannu", 18));
//		Collections.sort(arrayList);
//		arrayList.forEach(print -> System.out.println(print.getAge()));
		
		Map<Boolean, List<Student>> collect = arrayList.stream().collect(Collectors.partitioningBy(d -> d.getAge() > 21));
		collect.forEach((a,b) -> System.out.println(a + " , " + b));
		
		IntSummaryStatistics summaryStatistics = arrayList.stream().collect(Collectors.summarizingInt(d -> d.getAge()));
		System.out.println(summaryStatistics);
		
		List<Student> collect2 = arrayList.stream().filter(data -> data.getAge() > 18).collect(Collectors.toList());
		System.out.println(collect2);
				
	}
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String string, int i) {
		this.name = string;
		this.age = i;
	}

	@Override
    public int compareTo(Student other) {
        return this.age - other.age; // Sorts by age in ascending order
    }
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
        return "Student{name='" + name + "', age=" + age + "}";
	}
}

