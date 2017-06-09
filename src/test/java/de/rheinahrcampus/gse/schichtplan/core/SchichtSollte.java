package de.rheinahrcampus.gse.schichtplan.core;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class SchichtSollte {
	
	@Test
	public void EinenKommentarEnthaltenKoennen() {
		Schichtplan sp1 = new Schichtplan(2017, Quartalszahl.DREI);
		Schicht schicht1 = new Schicht(sp1, LocalDate.of(2017, 1, 1),Schichtart.FRUEH);
		Mitarbeiter mitarbeiter1 = new Mitarbeiter("Hans","Nachname", Beruf.PFLEGEHELFER,"123");
		schicht1.fuegeMitarbeiterHinzu(mitarbeiter1);
		
		assertEquals("", schicht1.getKommentar(mitarbeiter1));
		schicht1.fuegeKommentarHinzu(mitarbeiter1,"Test");
		assertEquals("Test", schicht1.getKommentar(mitarbeiter1));
	}
		
	@Test
	public void MitarbeiterZugewiesenBekommen(){
		Schichtplan sp1 = new Schichtplan(2017, Quartalszahl.DREI);
		Schicht schicht1 = new Schicht(sp1, LocalDate.of(2017, 1, 1),Schichtart.FRUEH);
		Mitarbeiter mitarbeiter1 = new Mitarbeiter("Hans","Nachname", Beruf.PFLEGEHELFER,"123");
		
		assertEquals(0, schicht1.getMitarbeiter().size());
		schicht1.fuegeMitarbeiterHinzu(mitarbeiter1);
		assertEquals(1, schicht1.getMitarbeiter().size());
	}

}
