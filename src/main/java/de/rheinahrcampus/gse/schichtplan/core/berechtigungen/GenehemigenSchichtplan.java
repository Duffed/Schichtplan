package de.rheinahrcampus.gse.schichtplan.core.berechtigungen;

import de.rheinahrcampus.gse.schichtplan.core.Schichtplan;
import de.rheinahrcampus.gse.schichtplan.core.SchichtplanStatus;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.GenehmigenSchichtplanBerechtigung;

public class GenehemigenSchichtplan implements GenehmigenSchichtplanBerechtigung {

	@Override
	public boolean hatBerechtigung() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void genehmigen(Schichtplan schichtplan, SchichtplanStatus schichtplanstatus) {
		schichtplan.setStatus(schichtplanstatus);
	}

}
