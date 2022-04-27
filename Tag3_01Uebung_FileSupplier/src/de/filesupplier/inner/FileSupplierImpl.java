package de.filesupplier.inner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import de.filesupplier.FileSupplier;

public class FileSupplierImpl implements FileSupplier{

	private final Path path;
	
	public FileSupplierImpl(String filepath) {
		path = Path.of(filepath);
	}
	
	
	@Override
	public String get() {
		
		try {
			return Files.readString(path);
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
