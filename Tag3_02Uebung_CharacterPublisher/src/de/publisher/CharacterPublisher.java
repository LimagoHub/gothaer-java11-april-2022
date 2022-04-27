package de.publisher;

import java.util.concurrent.Flow.Publisher;
import java.util.function.Supplier;

import de.publisher.inner.CharacterPublisherImpl;

public interface CharacterPublisher extends Publisher<Character>{
	
	static <T> CharacterPublisher create(Supplier<T> supplier) {
		return new CharacterPublisherImpl(supplier);
	}
	
	void start();
	void awaitTermination();

}
