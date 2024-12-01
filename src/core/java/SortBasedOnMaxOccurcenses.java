package core.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortBasedOnMaxOccurcenses {

	public static void main(String[] args) {
		List<Integer> inputList = Arrays.asList(1, 2, 1, 3, 3, 1, 4, 5, 6, 6, 6, 6, 7, 7, 7, 7);

		// Call the method to sort the list based on occurrences
		List<Integer> sortedList = sortByOccurrences(inputList);

		// Output the sorted list
		System.out.println("Sorted List: " + sortedList);
	}

	public static List<Integer> sortByOccurrences(List<Integer> list) {
		// Create a map to store the frequency of each element
		Map<Integer, Long> frequencyMap = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		System.out.println("frequencyMap" + frequencyMap);
		// Sort the list based on frequency and then by natural order
		return list.stream().sorted((a, b) -> {
			int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
			System.out.println("freqCompare " + freqCompare);
			if (freqCompare == 0) {
				return a.compareTo(b); // Sort by natural order if frequencies are the same
			}
			return freqCompare;
		}).collect(Collectors.toList());
	}
}
