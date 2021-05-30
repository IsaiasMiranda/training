package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class appDemoStreams {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
		Stream st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));

		Stream<String> st2 = Stream.of("Isaias", "Marlucia", "Nazaré");
		System.out.println(Arrays.toString(st2.toArray()));

		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));

		//teste com fibonacci
		Stream<Long> st4 = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(100).toArray()));
	}

}
