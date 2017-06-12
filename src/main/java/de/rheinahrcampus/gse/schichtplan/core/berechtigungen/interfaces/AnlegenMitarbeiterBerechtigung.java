package de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces;

import de.rheinahrcampus.gse.schichtplan.core.Arbeitspensum;
import de.rheinahrcampus.gse.schichtplan.core.Beruf;

public interface AnlegenMitarbeiterBerechtigung {
	public abstract boolean hatBerechtigung();
	public abstract void anlegen(String vorname, String nachname, Beruf beruf, String passwort);
	public abstract void anlegen(String vorname, String nachname, Beruf beruf, String passwort, Arbeitspensum arbeitspensum);
}
