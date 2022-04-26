package de.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import de.tiere.Schwein;

public class Main {

	public static void main(String[] args) {
		
//		Comparator<Schwein> comparator = new Comparator<Schwein>() {
//
//			@Override
//			public int compare(Schwein o1, Schwein o2) {
//				
//				return o1.getName().compareTo(o2.getName());
//			}
//		};
		
		//Comparator<Schwein> comparator = (o1,o2)->o1.getName().compareTo(o2.getName());
		Comparator<Schwein> comparator = Comparator.comparing(Schwein::getName);
		comparator = comparator.thenComparingInt(Schwein::getGewicht);
		Comparator<Schwein> c = Comparator.nullsFirst(comparator);
		
		List<Schwein> liste = new ArrayList(Arrays.asList(null, new Schwein("Eins",12),new Schwein("Zwei",11),new Schwein("Drei",13), new Schwein("Vier",9),new Schwein("Eins",21),new Schwein("Eins",8)));
		
		Collections.sort(liste,c);
		
		liste.forEach(System.out::println);

	}
	
	

}
