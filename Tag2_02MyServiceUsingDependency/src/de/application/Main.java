package de.application;

import de.dependency.MyDependency;



public class Main {

	public static void main(String[] args) {
		
			
		MyDependency dep = MyDependency.create();
		
		dep.foo();

	}

}
