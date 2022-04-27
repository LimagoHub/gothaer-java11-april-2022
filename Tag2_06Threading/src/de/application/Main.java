package de.application;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import de.threads.MyThread;

public class Main {

	public static void main(String[] args) throws Exception{
		MyThread hund = new MyThread("Wau");
		MyThread katze = new MyThread("Miau");
		MyThread maus = new MyThread("Piep");
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		service.execute(hund);
		service.execute(katze);
		service.execute(maus);
		
		service.shutdown();
		service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		
		System.out.println("Wann?");
		
	}

}
