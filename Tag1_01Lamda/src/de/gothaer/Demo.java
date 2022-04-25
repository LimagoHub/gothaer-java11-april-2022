package de.gothaer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		new Demo().run();

	}

	private void run() {
		final int x = 10;
		Supplier<Integer> supplier =  () -> 42 + x;

		
		int ergebnis = supplier.get();
		System.out.println(ergebnis);
	}
	
	private Supplier<Integer> createSupplier() {
		int x = 10;
		return  () -> 42 + x;
	}

}
