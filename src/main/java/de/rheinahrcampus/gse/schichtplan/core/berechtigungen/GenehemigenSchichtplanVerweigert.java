package de.rheinahrcampus.gse.schichtplan.core.berechtigungen;

import de.rheinahrcampus.gse.schichtplan.core.Schichtplan;
import de.rheinahrcampus.gse.schichtplan.core.SchichtplanStatus;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.GenehmigenSchichtplanBerechtigung;

public class GenehemigenSchichtplanVerweigert implements GenehmigenSchichtplanBerechtigung {

	@Override
	public boolean hatBerechtigung() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void genehmigen(Schichtplan schichtplan, SchichtplanStatus schichtplanstatus) {
		// TODO Auto-generated method stub
		
	}

}
