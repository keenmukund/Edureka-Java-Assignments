package module9;

import java.util.*;
import java.util.stream.Collectors;

public class mod9cs3 {
	public static void main(String[] args) {
		List<String> members =Arrays.asList("Abish", "Bhargavi", "Alex", "Max", "Annie");
		System.out.println("The given list is "+members);
		int count = members.stream().filter(s->s.startsWith("A")).collect(Collectors.toList()).size();
		System.out.println("The Count of strings starting with letter \"A\" is "+count);
	}
}
