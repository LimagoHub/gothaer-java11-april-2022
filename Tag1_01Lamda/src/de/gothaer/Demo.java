package de.gothaer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		new Demo().run();

	}

	private void run() {
		//Supplier<Integer> supplier =  this::foo;
		Supplier<Integer> supplier =  () -> 42;
		Consumer<String> consumer = message->System.out.println(message);
		
		int ergebnis = supplier.get();
		consumer.accept("Hallo Welt " + ergebnis);
	}
	
	private int foo() {
		return 42;
	}
	
	private void ausgabe(String message) {
		System.out.println(message);
	}
	
	
	// Single Abstract Method Interface (SAM)
	@FunctionalInterface
	static interface MY_PTR {
		int myMethodName();
		
	}

}
