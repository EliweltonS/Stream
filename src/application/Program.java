package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		// Cria uma Stream apartir da lista
		Stream<Integer> st1 = list.stream().map(x -> x *10);//aplica função a cada elemento da stream
		
		System.out.println(Arrays.toString(st1.toArray/*converte stream para vetor*/()));

		
		Stream <String> st2 = Stream.of/*permite colocar os elemntos em parênteses*/ ("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p [0]+p[1]}).map(p -> p[0]);// java n possui tupla
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
				
	}

}
