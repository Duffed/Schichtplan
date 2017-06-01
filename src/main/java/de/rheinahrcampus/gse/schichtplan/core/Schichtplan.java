package de.rheinahrcampus.gse.schichtplan.core;

import java.time.LocalDate;
import java.util.List;

public class Schichtplan {
	private Quartal quartal;
	private int jahr;
	private SchichtplanStatus status;
	
	public Schichtplan(int jahr, Quartalszahl quartalszahl) {
		this.jahr = jahr;
		quartal = new Quartal(jahr, quartalszahl);
		status = SchichtplanStatus.UNGENEHMIGT;
	}
	
	public Quartal getQuartal(){
		return quartal;
	}
	
	public int getJahr(){
		return jahr;
	}
	
	public void setStatus(SchichtplanStatus status){
		this.status = status;
	}
	
	public SchichtplanStatus getStatus(){
		return this.status;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Hallo!");
		
		
		Quartal eins2017 = new Quartal(2016,Quartalszahl.EINS); //Schaltjahr
		
		for (LocalDate tag : eins2017.getTage()) {
			System.out.println(tag);
		}
		
		System.out.println("Tschüss");
	}
}
