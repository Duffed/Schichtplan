package de.rheinahrcampus.gse.schichtplan.core;

import java.util.Map;

public class SchichtVerwalter {

	private Mitarbeiter ausfuehrenderMitarbeiter;
	private Map<Schichtart, Integer> mitarbeiterProSchicht;
	// SchichtverwalterR(Mitarbeiter ausfuehrenderRMitarbeiterR)
	
	// erstelleSchicht() -- Berechtigungen pr�fen
	public SchichtVerwalter(Mitarbeiter mitarbeiter){
		ausfuehrenderMitarbeiter = mitarbeiter;
	}
}
