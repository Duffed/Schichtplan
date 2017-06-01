package de.rheinahrcampus.gse.schichtplan.core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SchichtplanSollte {

	@Test
	public void DenStatusAendernKoennen(){
		Schichtplan schichtplan1 = new Schichtplan(2017, Quartalszahl.EINS);
		
		assertEquals(SchichtplanStatus.UNGENEHMIGT,schichtplan1.getStatus());
		schichtplan1.setStatus(SchichtplanStatus.GENEHMIGT);
		assertEquals(SchichtplanStatus.GENEHMIGT,schichtplan1.getStatus());
	}
	
	// CTRL+ALT+R
	

}
