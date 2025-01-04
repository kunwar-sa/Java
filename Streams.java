import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	Student student = new Student();
	List<Student> li = student.createStudentList();
	List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 3, 2));
	List<String> names = new ArrayList<>(Arrays.asList("Messi", "Ronaldo", "Beckham", "Beckenbauer"));

	public static void main(String[] args) {

		Streams test = new Streams();
		// test.streamManipulation();
		// test.calculateAverage();
		// test.calcSumEvenOdd();
		// test.switchCase();
		// test.removeDuplicates();
		// test.stringStartingWithK();
		// test.sortStrings();
		// test.getMinMax();
		test.getSecondHighest();

	}

	public void getSecondHighest() {
		int secondLowest = nums.stream().distinct().sorted((a, b) -> a.compareTo(b)).skip(1).findFirst().orElse(null);
		int secondHighest = nums.stream().distinct().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().orElse(null);
		/*
		 * All these will work inside sorted for descending order
		 * Integer.compare(b, a)
		 * (a, b) -> b.compareTo(a)
		 * Comparator.reverseOrder()
		 */
		System.out.println(secondLowest + " " + secondHighest);
	}

	public void getMinMax() {

		int min = nums.stream().min(Integer::compare).orElse(null);
		int max = nums.stream().max(Integer::compare).orElse(null);

		System.out.println(min + " " + max);
	}

	public void sortStrings() {
		// names = names.stream().sorted().collect(Collectors.toList());
		names = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(names);
	}

	public void stringStartingWithK() {
		// names = names.stream().filter(x ->
		// x.startsWith("B")).collect(Collectors.toList());
		long y = names.stream().filter(x -> x.startsWith("B")).count();
		System.out.println(y);
	}

	public void removeDuplicates() {
		// nums =
		// nums.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
		nums = nums.stream().distinct().collect(Collectors.toList());
		System.out.println(nums);
	}

	public void calculateAverage() {

		double avg = nums.stream().mapToDouble(x -> x.intValue()).average().getAsDouble();
		System.out.println(avg);
	}

	public void calcSumEvenOdd() {

		int evenSum = nums.stream().filter(x -> x % 2 == 0).mapToInt(x -> x.intValue()).sum();
		int oddSum = nums.stream().filter(x -> x % 2 != 0).mapToInt(x -> x.intValue()).sum();

		System.out.println(evenSum + " " + oddSum);
	}

	public void switchCase() {
		names = names.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
		System.out.println(names);
	}

	public void streamManipulation() {

		// sum up any particular member of an object list
		// double totalPercentage = li.stream().collect(Collectors.summingDouble(x ->
		// x.getPercentage()));
		double totalPercentage = li.stream().mapToDouble(x -> x.getPercentage()).sum();
		// System.out.println(totalPercentage);

		// creating a hashmap from members of objects in a list
		Map<String, Integer> map = li.stream().collect(Collectors.toMap(x -> x.getName(), y -> y.getAge()));
		// Map<String, Integer> map =
		// li.stream().collect(Collectors.toMap(Student::getName, Student::getAge));
		// for(Map.Entry<String, Integer> x: map.entrySet()) {
		// System.out.println(x.getKey() + " : " + x.getValue());
		// }

		// Creating a list of attributes from a list of object
		List<String> name = li.stream().map(Student::getName).collect(Collectors.toList());
		// for(String x: name)
		// System.out.println(x);

		// Create a comma separated list from a list of objects
		String names = li.stream().map(Student::getName).collect(Collectors.joining(", "));
		// System.out.println(names);

		// Grouping by an attribute on an object from a List
		Map<Integer, List<Student>> map2 = li.stream().collect(Collectors.groupingBy(Student::getAge));
		// for(Map.Entry<Integer, List<Student>> x: map2.entrySet()) {
		// System.out.println(x.getKey() + " : " + x.getValue());
		// }

		// Create a list by taking 2 attributes of an object from a list
		List<Integer> someList = li.stream().flatMap(x -> Stream.of(x.getAge(), x.getMarks()))
				.collect(Collectors.toList());
		// System.out.println(someList);

		// sorting based on an attribute
		li.sort((x, y) -> x.getName().compareTo(y.getName()));
		li.sort((x, y) -> Integer.valueOf(x.getAge()).compareTo(Integer.valueOf(y.getAge())));
		System.out.println(li);
	}

}
