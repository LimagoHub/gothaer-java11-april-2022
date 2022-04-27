package de.filesupplier;

import java.util.function.Supplier;

import de.filesupplier.inner.FileSupplierImpl;

public interface FileSupplier extends Supplier<String>{
	
	static FileSupplier create(String filepath){
		return new FileSupplierImpl(filepath);
	}
	
}
