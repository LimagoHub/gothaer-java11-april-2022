package de.tiere;

public class Schwein implements Comparable<Schwein>{
	
	private String name;
	private int gewicht;
	public Schwein(String name, int gewicht) {
		super();
		this.name = name;
		this.gewicht = gewicht;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	@Override
	public String toString() {
		return "Schwein [name=" + name + ", gewicht=" + gewicht + "]";
	}
	
	// Naturell Order
	@Override
	public int compareTo(Schwein other) {
		// TODO Auto-generated method stub
		return gewicht - other.gewicht;
	}
	
	

}
