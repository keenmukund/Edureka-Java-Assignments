package module9;
import java.util.stream.*;
import java.util.*;

public class mod9cs1 {
	public static void main(String[] args) {
		Stream<String> names = Stream.of("aBc", "d", "ef");
		List<String> name = names.map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println("After converting the strings into uppercase, the list becomes : "+name);
	}
}
