package de.rheinahrcampus.gse.schichtplan.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpcSollte {

	@Test
	public void denAngemeldetenBenutzerZurueckgebenKoennen() {
		Mitarbeiter_old ma = new Mitarbeiter_old("Vor", "Nach", Beruf.EXAMINIERTE_PFLEGEKRAFT,"123");
		ShiftPlanCreator spc = new ShiftPlanCreator(ma);
		
		assertEquals(spc.getAngemeldetenMitarbeiter(),ma);
	}
	
	@Test
	public void einenSchichtplanErstellenKoennen(){
		Mitarbeiter_old ma = new Mitarbeiter_old("Vor", "Nach", Beruf.STATIONSLEITUNG,"123");
		ShiftPlanCreator spc = new ShiftPlanCreator(ma);
		
		assertNull(spc.getSchichtplaene(Station.getChirugie()));
		try {
			spc.erstelleSchichtplan(Station.getChirugie(), 2017, Quartalszahl.EINS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		assertEquals(1, spc.getSchichtplaene(Station.getChirugie()).size());	
	}

}
