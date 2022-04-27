package de.publisher.inner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import de.publisher.CharacterPublisher;

public class CharacterPublisherImpl extends SubmissionPublisher<Character> implements CharacterPublisher{

	private final String toSend;
	
	public <T> CharacterPublisherImpl(Supplier<T> supplier) {
		toSend = supplier.get().toString();
	}
	
	@Override
	public void start() {
		toSend.chars().mapToObj(i->Character.valueOf((char) i)).forEachOrdered(this::submit);
		close();
	}

	@Override
	public void awaitTermination() {
		try {
			ExecutorService service = (ExecutorService) getExecutor();
			service.shutdown();
			service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
