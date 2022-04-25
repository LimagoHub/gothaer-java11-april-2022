package de.gothaer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		new Demo().run();

	}

	private void run() {
		
		MY_PTR ptr = new MY_PTR() {
			int zustand = 0;
			@Override
			public int myMethodName() {
				zustand ++;
				return zustand;
			}
		};
		MY_PTR ptr2 = this::foo;
		
		int  e1 = ptr.myMethodName();
		int e2 = ptr2.myMethodName();
		
		Supplier<Integer> supplier = this::foo;
		int e3 = supplier.get();
		
		Consumer<String> consumer = System.out::println;
		consumer.accept("Hallo");
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
