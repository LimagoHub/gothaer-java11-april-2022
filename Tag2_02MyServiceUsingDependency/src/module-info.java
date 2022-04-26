import de.dependency.MyDependency;

module tag2_02MyServiceUsingDependency {
	requires tag2_01Dependency; // Importiert Module
	
	uses MyDependency;
}