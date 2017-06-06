package de.rheinahrcampus.gse.schichtplan.core;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class QuartalSollte {

	@Test
	public void AuchEinSchaltJahrBeachten() {
		Quartal quartalMitSchaltjahr = new Quartal(2016,Quartalszahl.EINS);
		assertThat(quartalMitSchaltjahr.getTage(), hasItem(LocalDate.of(2016, 2, 29)));
//		Quartal quartalOhneSchaltjahr = new Quartal(2017,Quartalszahl.EINS);
//		assertThat(quartalOhneSchaltjahr.getTage(), not(hasItem(LocalDate.of(2017, 2, 29))));
	}

}
