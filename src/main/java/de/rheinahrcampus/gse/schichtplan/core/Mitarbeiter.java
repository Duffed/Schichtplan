package de.rheinahrcampus.gse.schichtplan.core;

public class Mitarbeiter {
	private Beruf beruf;
	private String vorname;
	private String nachname;
	private int arbeitspensum;
	
	public Mitarbeiter(String vorname, String nachname, Beruf beruf){
		this.vorname = vorname;
		this.nachname = nachname;
		this.beruf = beruf;
	}
}
