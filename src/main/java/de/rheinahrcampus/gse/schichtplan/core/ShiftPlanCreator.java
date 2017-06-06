package de.rheinahrcampus.gse.schichtplan.core;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ShiftPlanCreator {
	 private Mitarbeiter angemeldeterMitarbeiter;
	 private List<Schichtplan> schichtplaeneListe = new LinkedList<>();
	 private Map<Station, List<Schichtplan>> schichtplaene = new HashMap<>();
	
	 public ShiftPlanCreator(Mitarbeiter mitarbeiter) {
		 this.angemeldeterMitarbeiter = mitarbeiter;
	 }
	 
	 public Mitarbeiter getAngemeldetenMitarbeiter(){
		return angemeldeterMitarbeiter;
	}
	 
	 public List<Schichtplan> getSchichtplaene(Station station){
		 return schichtplaene.get(station);
	 }
	 
	 public Schichtplan findeSchichtplan(Station station, int jahr, Quartalszahl quartalszahl){
		 for (Schichtplan sp : getSchichtplaene(station)) {
			 if (sp.getJahr() == jahr && sp.getQuartalszahl() == quartalszahl){
				 return sp;
			 }
		 }
		 
		 return null;
	 }
	
	 public boolean erstelleSchichtplan(Station station, int jahr, Quartalszahl quartalszahl) {
		if (getAngemeldetenMitarbeiter().hatBerechtigung(Berechtigung.SCHICHTPLAN_ERSTELLEN)){
			schichtplaeneListe.add(new Schichtplan(jahr, quartalszahl));
			schichtplaene.put(station, schichtplaeneListe);
			return true;
		} else {
			System.out.println("Falscher Beruf: " + angemeldeterMitarbeiter.getBeruf().getName());
			return false;
		}
	}
}