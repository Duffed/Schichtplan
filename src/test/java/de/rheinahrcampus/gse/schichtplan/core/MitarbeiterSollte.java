package de.rheinahrcampus.gse.schichtplan.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class MitarbeiterSollte {

	@Test
	public void AlsStationsleiterEinenSchichtplanErstellenMuessen() {
		Mitarbeiter_old SL = new Mitarbeiter_old("SLVorname", "Nachname", Beruf.STATIONSLEITUNG,"123");	
		assertTrue(SL.hatBerechtigung(Berechtigung.SCHICHTPLAN_ERSTELLEN));
	}
	

}
