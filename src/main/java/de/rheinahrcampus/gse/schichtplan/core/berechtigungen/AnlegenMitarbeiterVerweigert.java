package de.rheinahrcampus.gse.schichtplan.core.berechtigungen;

import de.rheinahrcampus.gse.schichtplan.core.Arbeitspensum;
import de.rheinahrcampus.gse.schichtplan.core.Beruf;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.AnlegenMitarbeiterBerechtigung;

public class AnlegenMitarbeiterVerweigert implements AnlegenMitarbeiterBerechtigung {

	@Override
	public boolean hatBerechtigung() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void anlegen(String vorname, String nachname, Beruf beruf, String passwort) {
		//
	}


	@Override
	public void anlegen(String vorname, String nachname, Beruf beruf, String passwort, Arbeitspensum arbeitspensum) {
		//
	}

}
