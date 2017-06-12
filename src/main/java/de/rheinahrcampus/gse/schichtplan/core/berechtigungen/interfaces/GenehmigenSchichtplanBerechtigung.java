package de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces;

import de.rheinahrcampus.gse.schichtplan.core.Schichtplan;
import de.rheinahrcampus.gse.schichtplan.core.SchichtplanStatus;

public interface GenehmigenSchichtplanBerechtigung {
	public abstract boolean hatBerechtigung();
	public abstract void genehmigen(Schichtplan schichtplan, SchichtplanStatus schichtplanstatus);
}
