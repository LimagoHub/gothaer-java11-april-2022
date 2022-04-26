import de.dependency.MyDependency;
import de.dependency.inner.MyDepenencyImpl;

module tag2_01Dependency {
	
	exports de.dependency;// die Pakete
	
	provides MyDependency with MyDepenencyImpl; // Produzentenseite
	uses MyDependency; // Consumentenseite
}