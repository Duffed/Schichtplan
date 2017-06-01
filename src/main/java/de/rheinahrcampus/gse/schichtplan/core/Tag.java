package de.rheinahrcampus.gse.schichtplan.core;

import java.time.LocalDate;
import java.util.List;
//nicht notwendig, denke ich.
public class Tag {
	private Schichtplan schichtplan;
	private List<Schicht> schichten;
	private LocalDate datum;
	private Quartal quartal;
	
	public Tag(Schichtplan schichtplan, Quartal quartal, LocalDate datum) {
		this.schichtplan = schichtplan;
		this.quartal = quartal;
		this.datum = datum;
	}
}
