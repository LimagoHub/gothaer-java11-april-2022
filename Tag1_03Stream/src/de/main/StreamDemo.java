package de.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import de.tiere.Schwein;

public class StreamDemo {

	public static void main(String[] args) {
		// Init
		// operations
		// Terminierung
		
		List<Schwein> liste = new ArrayList(Arrays.asList(new Schwein("Eins",12),new Schwein("Zwei",11),new Schwein("Drei",13), new Schwein("Vier",9),new Schwein("Eins",21),new Schwein("Eins",8)));
		
		Stream<Schwein> stream = liste.stream();
		System.out.println(stream
			.filter(s->s.getName().equalsIgnoreCase("Eins"))
			.collect(Collectors.toList()));
		
			
	}
	
	public boolean isPrime(int possiblePrime) {
		if(possiblePrime == 1) return false;
		
		for(int divider = 0; divider <= possiblePrime/2; divider++) {
			if(possiblePrime % divider == 0) return false;
		}
		return true;
	}

}
