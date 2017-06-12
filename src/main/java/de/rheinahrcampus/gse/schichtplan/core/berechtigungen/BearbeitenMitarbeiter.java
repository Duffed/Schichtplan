package de.rheinahrcampus.gse.schichtplan.core.berechtigungen;

import de.rheinahrcampus.gse.schichtplan.core.Arbeitspensum;
import de.rheinahrcampus.gse.schichtplan.core.Beruf;
import de.rheinahrcampus.gse.schichtplan.core.Mitarbeiter;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.BearbeitenMitarbeiterBerechtigung;

public class BearbeitenMitarbeiter implements BearbeitenMitarbeiterBerechtigung {

	@Override
	public boolean hatBerechtigung() {
		return true;
	}

	@Override
	public void bearbeiteVorname(Mitarbeiter ma, String vorname) {
		ma.setVorname(vorname);
	}

	@Override
	public void bearbeiteNachname(Mitarbeiter ma, String nachname) {
		ma.setNachname(nachname);
	}

	@Override
	public void bearbeiteBeruf(Mitarbeiter ma, Beruf beruf) {
		ma.setBeruf(beruf);
	}

	@Override
	public void bearbeiteArbeitspensum(Mitarbeiter ma, Arbeitspensum ap) {
		ma.setArbeitspensum(ap);
	}

	@Override
	public void bearbeitePasswort(Mitarbeiter ma, String pw) {
		ma.setPasswort(pw);
	}

	@Override
	public void bearbeiteErstellenSchichtplanBerechtigung(Mitarbeiter ma, boolean berechtigt) {
		if (berechtigt) { ma.setErstellenSchichtplanBerechtigung(new ErstellenSchichtplan());}
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
