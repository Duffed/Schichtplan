package de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces;

import de.rheinahrcampus.gse.schichtplan.core.Arbeitspensum;
import de.rheinahrcampus.gse.schichtplan.core.Beruf;
import de.rheinahrcampus.gse.schichtplan.core.Mitarbeiter;

public interface BearbeitenMitarbeiterBerechtigung {
	public abstract boolean hatBerechtigung();
	public abstract void bearbeiteVorname(Mitarbeiter ma,String vorname);
	public abstract void bearbeiteNachname(Mitarbeiter ma, String nachname);
	public abstract void bearbeiteBeruf(Mitarbeiter ma, Beruf beruf);
	public abstract void bearbeiteArbeitspensum(Mitarbeiter ma, Arbeitspensum ap);
	public abstract void bearbeitePasswort(Mitarbeiter ma, String pw);
	public abstract void bearbeiteErstellenSchichtplanBerechtigung(Mitarbeiter ma, boolean berechtigt);
	public abstract void bearbeiteBereitstellenSchichtplanBerechtigung(Mitarbeiter ma, boolean berechtigt);
//	public abstract void VeroeffentlichenSchichtplanBerechtigung(boolean berechtigt);
	public abstract void bearbeiteFestlegenZeitspanneBerechtigung(Mitarbeiter ma, boolean berechtigt);
	public abstract void bearbeiteAnlegenMitarbeiterBerechtigung(Mitarbeiter ma, boolean berechtigt);
	public abstract void bearbeiteBearbeitenMitarbeiterBerechtigung(Mitarbeiter ma, boolean berechtigt);
	public abstract void bearbeiteEinsehenSchichtplaeneStationBerechtigung(Mitarbeiter ma, boolean berechtigt);
	public abstract void bearbeiteAusdruckenSchichtplaeneStationBerechtigung(Mitarbeiter ma, boolean berechtigt);
	public abstract void bearbeiteEinsehenSchichtplaeneStationenBerechtigung(Mitarbeiter ma, boolean berechtigt);
	public abstract void bearbeiteAusdruckenSchichtplaeneStationenBerechtigung(Mitarbeiter ma, boolean berechtigt);
	public abstract void bearbeiteGenehmigenSchichtplanBerechtigung(Mitarbeiter ma, boolean berechtigt);
	public abstract void bearbeiteAnzeigenLassenGesamtansichtBerechtigung(Mitarbeiter ma, boolean berechtigt);
}
