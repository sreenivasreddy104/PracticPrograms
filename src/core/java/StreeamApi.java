package core.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreeamApi {
	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		Map<Object, Long> collect = arrayList.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		collect.forEach((key, value) -> System.out.println(key + "KEY" + "," + value + "Value"));
		
        Map<Object, Long> collect1 = arrayList.stream()
                .collect(Collectors.groupingBy(a-> a, Collectors.counting()));
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("xyz");
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        
        List<String> list2 = list.stream().filter(d -> d.startsWith("a")).collect(Collectors.toList());
        list2.forEach(System.out::println);
	}
}
