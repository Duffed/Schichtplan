package de.rheinahrcampus.gse.schichtplan.core;

import java.util.Map;

public class SchichtVerwalter {

	private Mitarbeiter_old ausfuehrenderMitarbeiter;
	private Map<Schichtart, Integer> mitarbeiterProSchicht;
	// SchichtverwalterR(Mitarbeiter ausfuehrenderRMitarbeiterR)
	
	// erstelleSchicht() -- Berechtigungen prüfen
	public SchichtVerwalter(Mitarbeiter_old mitarbeiter){
		ausfuehrenderMitarbeiter = mitarbeiter;
	}
}
