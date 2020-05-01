package module9;
import java.util.*;
import java.util.stream.Collectors;

public class mod9cs2 {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		System.out.println("The given list is "+strings);
		List<String> strings2 = strings.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
		System.out.println("The list having non-empty strings is "+strings2);
	}
}
