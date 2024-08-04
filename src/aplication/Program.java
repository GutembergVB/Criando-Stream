package aplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		  // Criando Stream
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		  // Criando ima stream a partir de uma lista e aplicando uma função com o .map() 
		Stream<Integer> st1 = list.stream().map(x -> x*10);
          System.out.println(Arrays.toString(st1.toArray()));//.toArray() converte a Stream em um vetor.
		    
		  // Criando uma stream de String com Stream.of()
		Stream<String> st2 = Stream.of("Maria ", "Alex "," Bob");
		  System.out.println(Arrays.toString(st2.toArray()));
		 
		  // Criando uma stream  com Stream.iterate().
		   /* .iterate() permite criar um fluxo infinito gerado por uma função,
		      usando o limitador de fluxo .limit() e criando uma novo vetor com
		      .toArrays(). */
		Stream<Integer> st3 = Stream.iterate(0, x -> x+2);
	      System.out.println(Arrays.toString(st3.limit(10).toArray()));
	      
	      // Criando uma stream  com Stream.iterate() a sequêncide de Fibonacci.
	    Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1],p[0]+p[1]}).map(p -> p[0]);
	      System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}
}