package com.poc.streams.advanceconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Foo{
	
	String name;
	List<Bar> bars = new ArrayList<>();
	
	public Foo(String name) {
		this.name = name;
	}
	
}

class Bar{
	String name;

	public Bar(String name) {
		this.name = name;
	}
	
}
public class FlatMapApp3 {

	public static void main(String[] args) {
		
		List<Foo> foos = new ArrayList<>();
		IntStream.range(1,4).forEach(f -> foos.add(new Foo("foo :"+f)));
		
		foos.forEach(foo -> IntStream.range(1,4).forEach(t -> foo.bars.add(new Bar("bar"+ t +" <- "+foo.name))));

		foos.stream().flatMap(foo -> foo.bars.stream()).forEach(b -> System.out.println(b.name));
		
		
		//Rewriting using peek
		
		IntStream
		.range(1, 4)
		.mapToObj(i -> new Foo("foo : "+i))
		.peek(foo -> IntStream.range(1, 4).mapToObj(j -> new Bar("bar "+j+"<-"+foo.name))
		.forEach(foo.bars::add)).flatMap(foo -> foo.bars.stream()).forEach(b -> System.out.println(b.name));
		
	}

}
