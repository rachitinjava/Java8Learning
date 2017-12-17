package com.poc.streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

/*Java 8 streams cannot be reused. As soon as you call any terminal operation the stream is closed*/
public class StreamSupplierApp4 {

	public static void main(String[] args) {

		/*Stream stream = Stream.of("a1","b1","c1").filter(s-> s.startsWith("a"));
		
		stream.anyMatch(s -> true);
		
		stream.noneMatch(s -> true);
		*/
		/*How to solve this?*/
		
		Supplier<Stream<String>> streamSupplier = () -> Stream.of("a1","b1","c1").filter(s-> s.startsWith("a"));
		
		streamSupplier.get().anyMatch(s -> true);
		streamSupplier.get().noneMatch(s -> true);
		
	}

}
