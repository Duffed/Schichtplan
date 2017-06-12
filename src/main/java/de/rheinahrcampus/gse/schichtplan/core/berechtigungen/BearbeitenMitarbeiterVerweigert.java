package de.rheinahrcampus.gse.schichtplan.core.berechtigungen;

import de.rheinahrcampus.gse.schichtplan.core.Arbeitspensum;
import de.rheinahrcampus.gse.schichtplan.core.Beruf;
import de.rheinahrcampus.gse.schichtplan.core.Mitarbeiter;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.BearbeitenMitarbeiterBerechtigung;

public class BearbeitenMitarbeiterVerweigert implements BearbeitenMitarbeiterBerechtigung {

	@Override
	public boolean hatBerechtigung() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void bearbeiteVorname(Mitarbeiter ma, String vorname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteNachname(Mitarbeiter ma, String nachname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteBeruf(Mitarbeiter ma, Beruf beruf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteArbeitspensum(Mitarbeiter ma, Arbeitspensum ap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeitePasswort(Mitarbeiter ma, String pw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteErstellenSchichtplanBerechtigung(Mitarbeiter ma, boolean berechtigt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteBereitstellenSchichtplanBerechtigung(Mitarbeiter ma, boolean berechtigt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteFestlegenZeitspanneBerechtigung(Mitarbeiter ma, boolean berechtigt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteAnlegenMitarbeiterBerechtigung(Mitarbeiter ma, boolean berechtigt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteBearbeitenMitarbeiterBerechtigung(Mitarbeiter ma, boolean berechtigt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteEinsehenSchichtplaeneStationBerechtigung(Mitarbeiter ma, boolean berechtigt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteAusdruckenSchichtplaeneStationBerechtigung(Mitarbeiter ma, boolean berechtigt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteEinsehenSchichtplaeneStationenBerechtigung(Mitarbeiter ma, boolean berechtigt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteAusdruckenSchichtplaeneStationenBerechtigung(Mitarbeiter ma, boolean berechtigt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteGenehmigenSchichtplanBerechtigung(Mitarbeiter ma, boolean berechtigt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bearbeiteAnzeigenLassenGesamtansichtBerechtigung(Mitarbeiter ma, boolean berechtigt) {
		// TODO Auto-generated method stub
		
	}

}
