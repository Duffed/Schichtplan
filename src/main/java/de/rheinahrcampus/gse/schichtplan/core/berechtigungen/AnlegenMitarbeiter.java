package de.rheinahrcampus.gse.schichtplan.core.berechtigungen;

import de.rheinahrcampus.gse.schichtplan.core.Arbeitspensum;
import de.rheinahrcampus.gse.schichtplan.core.Beruf;
import de.rheinahrcampus.gse.schichtplan.core.Mitarbeiter;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.AnlegenMitarbeiterBerechtigung;

public class AnlegenMitarbeiter implements AnlegenMitarbeiterBerechtigung {

	@Override
	public boolean hatBerechtigung() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public void anlegen(String vorname, String nachname, Beruf beruf, String passwort) {
		try {
			new Mitarbeiter(vorname, nachname, beruf, passwort);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	@Override
	public void anlegen(String vorname, String nachname, Beruf beruf, String passwort, Arbeitspensum arbeitspensum) {
		try {
			new Mitarbeiter(vorname, nachname, beruf, passwort, arbeitspensum);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
