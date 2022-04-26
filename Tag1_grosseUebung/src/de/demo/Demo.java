package de.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;
public class Demo {

	public static void main(String[] args) {
		
		
		String fileName = "dism.log";

		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream
			.collect(Collectors.joining("\n"))
			.chars()
			.mapToObj(i->Character.valueOf((char) i))
			.collect(groupingBy(Function.identity(), counting()))
			.forEach((k,v)->System.out.println(String.format("'%s' hat die Anzahl %s", k,v)));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
