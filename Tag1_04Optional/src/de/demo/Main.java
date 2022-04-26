package de.demo;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		new Main().run();

	}
	
	
	private void run() {
		String s = getString().orElseThrow(()->new RuntimeException("Upps"));
		
		
		
	}


	private Optional<String> getString() {
		return Optional.empty();
	}

}
