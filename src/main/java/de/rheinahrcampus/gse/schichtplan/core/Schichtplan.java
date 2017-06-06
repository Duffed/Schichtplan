package de.rheinahrcampus.gse.schichtplan.core;

import java.time.LocalDate;
import java.util.List;

public class Schichtplan {
	private Quartal quartal;
	private int jahr;
	private SchichtplanStatus status;
	private Quartalszahl quartalszahl;
	
	public Schichtplan(int jahr, Quartalszahl quartalszahl) {
		this.jahr = jahr;
		this.quartalszahl = quartalszahl;
		quartal = new Quartal(jahr, quartalszahl);
		status = SchichtplanStatus.UNGENEHMIGT;
	}
	
	public Quartalszahl getQuartalszahl() {
		return quartalszahl;
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
		Mitarbeiter ma = new Mitarbeiter("Joscha", "Diederichs", Beruf.STATIONSLEITUNG, "123");
		ShiftPlanCreator spc = new ShiftPlanCreator(ma);
		
		Station station = new Station();
		
		System.out.println("Hallo!");
		
		Quartal eins2017 = new Quartal(2016,Quartalszahl.EINS); //Schaltjahr
		
		for (LocalDate tag : eins2017.getTage()) {
			System.out.println(tag);
		}
		
		System.out.println("Tschüss");
		System.out.println(Beruf.EXAMINIERTE_PFLEGEKRAFT.getName());
		
		spc.erstelleSchichtplan(station, 2017, Quartalszahl.EINS);
		spc.erstelleSchichtplan(station, 69, Quartalszahl.ZWEI);
		for (Schichtplan sp : spc.getSchichtplaene(station)) {
			System.out.println(sp.getJahr());
		}
		System.out.println(ma.getBenutzername());
	}
}

