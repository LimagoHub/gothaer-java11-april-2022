package de.dependency.inner;

import de.dependency.MyDependency;

public class MyDepenencyImpl implements MyDependency {
	
	@Override
	public void foo() {
		System.out.println("Hier ist Foo");
	}

}
