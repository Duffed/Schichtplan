package de.rheinahrcampus.gse.schichtplan.core;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Schicht {
	private List<Mitarbeiter> mitarbeiter;
	private Schichtart schichtart;
	private Map<Mitarbeiter, String> kommentare;
	private Schichtplan schichtplan;
	private LocalDate datum;
	
	public Schicht(Schichtplan schichtplan, LocalDate datum, Schichtart schichtart) {
		this.schichtart = schichtart;
		this.schichtart = schichtart;
		this.datum = datum;
	}
	
	public void kommentarHinzufuegen(Mitarbeiter mitarbeiter, String kommentar){
		kommentare.put(mitarbeiter, kommentar);
	}
	
	public void fuegeMitarbeiterHinzu(Mitarbeiter mitarbeiter){ //Object?
		this.mitarbeiter.add(mitarbeiter);
	}
	
	public Iterable<Mitarbeiter> getMitarbeiter(){
		return mitarbeiter;
	}

}
