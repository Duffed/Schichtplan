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
		Mitarbeiter_old ma = new Mitarbeiter_old("Joscha", "Diederichs", Beruf.STATIONSLEITUNG, "123");
		ShiftPlanCreator spc = new ShiftPlanCreator(ma);
		
		System.out.println("Hallo!");
		
		Quartal eins2017 = new Quartal(2016,Quartalszahl.EINS); //Schaltjahr
		
		for (LocalDate tag : eins2017.getTage()) {
			System.out.println(tag);
		}
		
		System.out.println("Tsch�ss");
		System.out.println(Beruf.EXAMINIERTE_PFLEGEKRAFT.getName());
		
		try {
			spc.erstelleSchichtplan(Station.getChirugie(), 2017, Quartalszahl.EINS);
			spc.erstelleSchichtplan(Station.getChirugie(), 69, Quartalszahl.ZWEI);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Schichtplan sp : spc.getSchichtplaene(Station.getChirugie())) {
			System.out.println(sp.getJahr());
		}
		System.out.println(ma.getBenutzername());
	}
}

