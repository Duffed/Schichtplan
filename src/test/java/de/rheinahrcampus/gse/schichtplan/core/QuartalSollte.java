package de.rheinahrcampus.gse.schichtplan.core;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class QuartalSollte {

	@Test
	public void AuchEinSchaltJahrBeachten() {
		Quartal quartalMitSchaltjahr = new Quartal(2016,Quartalszahl.EINS);
		
		assertThat(quartalMitSchaltjahr.getTage(), hasItem(LocalDate.of(2016, 2, 29)));
				
	}

}
