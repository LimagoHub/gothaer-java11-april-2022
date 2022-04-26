package de.dependency;

import java.util.ServiceLoader;

public interface MyDependency {

	void foo();

	static MyDependency create() {
		ServiceLoader<MyDependency> loader = ServiceLoader.load(MyDependency.class);
		return loader.findFirst().get();
	}
}