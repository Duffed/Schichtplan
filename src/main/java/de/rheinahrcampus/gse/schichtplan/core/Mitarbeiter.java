package de.rheinahrcampus.gse.schichtplan.core;

import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.ErstellenSchichtplanVerweigert;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.AnlegenMitarbeiterBerechtigung;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.AnzeigenLassenGesamtansichtBerechtigung;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.AusdruckenSchichtplaeneStationBerechtigung;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.AusdruckenSchichtplaeneStationenBerechtigung;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.BearbeitenMitarbeiterBerechtigung;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.BereitstellenSchichtplanBerechtigung;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.EinsehenSchichtplaeneStationBerechtigung;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.EinsehenSchichtplaeneStationenBerechtigung;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.ErstellenSchichtplanBerechtigung;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.FestlegenZeitspanneBerechtigung;
import de.rheinahrcampus.gse.schichtplan.core.berechtigungen.interfaces.GenehmigenSchichtplanBerechtigung;

public class Mitarbeiter {
	
	private String nachname;
	private String vorname;
	private Arbeitspensum arbeitspensum;
	private Beruf beruf;
	private String benutzername;
	private String passwort;
	
	private ErstellenSchichtplanBerechtigung erstellenSchichtplanBerechtigung;
	private BereitstellenSchichtplanBerechtigung bereitstellenSchichtplanBerechtigung;
//	private VeroeffentlichenSchichtplanBerechtigung veroeffentlichenSchichtplanBerechtigung;
	private FestlegenZeitspanneBerechtigung festlegenZeitspanneBerechtigung;
	private AnlegenMitarbeiterBerechtigung anlegenMitarbeiterBerechtigung;
	private BearbeitenMitarbeiterBerechtigung bearbeitenMitarbeiterBerechtigung;
	private EinsehenSchichtplaeneStationBerechtigung einsehenSchichtplaeneStationBerechtigung;
	private AusdruckenSchichtplaeneStationBerechtigung AusdruckenSchichtplaeneStationBerechtigung;
	private EinsehenSchichtplaeneStationenBerechtigung einsehenSchichtplaeneStationenBerechtigung;
	private AusdruckenSchichtplaeneStationenBerechtigung AusdruckenSchichtplaeneStationenBerechtigung;
	private GenehmigenSchichtplanBerechtigung genehmigenSchichtplanBerechtigung;
	private AnzeigenLassenGesamtansichtBerechtigung anzeigenLassenGesamtansichtBerechtigung;
	
	public Mitarbeiter(String nachname, String vorname, Beruf beruf, String passwort) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.beruf = beruf;
		this.passwort = passwort;
		this.arbeitspensum = Arbeitspensum.HUNDERT;
		if (nachname.length() > 5) {
			this.benutzername = vorname.toLowerCase().substring(0, 1) + nachname.toLowerCase().substring(0, 6);
		} else {
			this.benutzername = vorname.toLowerCase().substring(0, 1) + nachname.toLowerCase();
		}		
	}
	
	private void setStandardBerechtigungen(){
		this.erstellenSchichtplanBerechtigung = new ErstellenSchichtplanVerweigert();
	}
	
	public Mitarbeiter(String nachname, String vorname, Beruf beruf, String passwort, Arbeitspensum arbeitspensum) {
		this(nachname, vorname, beruf, passwort);
		this.arbeitspensum = arbeitspensum;
	}
	
	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public Arbeitspensum getArbeitspensum() {
		return arbeitspensum;
	}

	public void setArbeitspensum(Arbeitspensum arbeitspensum) {
		this.arbeitspensum = arbeitspensum;
	}

	public Beruf getBeruf() {
		return beruf;
	}

	public void setBeruf(Beruf beruf) {
		this.beruf = beruf;
	}

//	public Passwort getPasswort() {
//		return passwort;
//	}
//
//	public void setPasswort(Passwort passwort) {
//		this.passwort = passwort;
//	}

	public ErstellenSchichtplanBerechtigung getErstellenSchichtplanBerechtigung() {
		return erstellenSchichtplanBerechtigung;
	}

	public void setErstellenSchichtplanBerechtigung(ErstellenSchichtplanBerechtigung erstellenSchichtplanBerechtigung) {
		this.erstellenSchichtplanBerechtigung = erstellenSchichtplanBerechtigung;
	}

	public BereitstellenSchichtplanBerechtigung getBereitstellenSchichtplanBerechtigung() {
		return bereitstellenSchichtplanBerechtigung;
	}

	public void setBereitstellenSchichtplanBerechtigung(
			BereitstellenSchichtplanBerechtigung bereitstellenSchichtplanBerechtigung) {
		this.bereitstellenSchichtplanBerechtigung = bereitstellenSchichtplanBerechtigung;
	}

//	public VeroeffentlichenSchichtplanBerechtigung getVeroeffentlichenSchichtplanBerechtigung() {
//		return veroeffentlichenSchichtplanBerechtigung;
//	}
//
//	public void setVeroeffentlichenSchichtplanBerechtigung(
//			VeroeffentlichenSchichtplanBerechtigung veroeffentlichenSchichtplanBerechtigung) {
//		this.veroeffentlichenSchichtplanBerechtigung = veroeffentlichenSchichtplanBerechtigung;
//	}

	public FestlegenZeitspanneBerechtigung getFestlegenZeitspanneBerechtigung() {
		return festlegenZeitspanneBerechtigung;
	}

	public void setFestlegenZeitspanneBerechtigung(FestlegenZeitspanneBerechtigung festlegenZeitspanneBerechtigung) {
		this.festlegenZeitspanneBerechtigung = festlegenZeitspanneBerechtigung;
	}

	public AnlegenMitarbeiterBerechtigung getAnlegenMitarbeiterBerechtigung() {
		return anlegenMitarbeiterBerechtigung;
	}

	public void setAnlegenMitarbeiterBerechtigung(AnlegenMitarbeiterBerechtigung anlegenMitarbeiterBerechtigung) {
		this.anlegenMitarbeiterBerechtigung = anlegenMitarbeiterBerechtigung;
	}

	public BearbeitenMitarbeiterBerechtigung getBearbeitenMitarbeiterBerechtigung() {
		return bearbeitenMitarbeiterBerechtigung;
	}

	public void setBearbeitenMitarbeiterBerechtigung(BearbeitenMitarbeiterBerechtigung bearbeitenMitarbeiterBerechtigung) {
		this.bearbeitenMitarbeiterBerechtigung = bearbeitenMitarbeiterBerechtigung;
	}

	public EinsehenSchichtplaeneStationBerechtigung getEinsehenSchichtplaeneStationBerechtigung() {
		return einsehenSchichtplaeneStationBerechtigung;
	}

	public void setEinsehenSchichtplaeneStationBerechtigung(
			EinsehenSchichtplaeneStationBerechtigung einsehenSchichtplaeneStationBerechtigung) {
		this.einsehenSchichtplaeneStationBerechtigung = einsehenSchichtplaeneStationBerechtigung;
	}

	public AusdruckenSchichtplaeneStationBerechtigung getAusdruckenSchichtplaeneStationBerechtigung() {
		return AusdruckenSchichtplaeneStationBerechtigung;
	}

	public void setAusdruckenSchichtplaeneStationBerechtigung(
			AusdruckenSchichtplaeneStationBerechtigung ausdruckenSchichtplaeneStationBerechtigung) {
		AusdruckenSchichtplaeneStationBerechtigung = ausdruckenSchichtplaeneStationBerechtigung;
	}

	public EinsehenSchichtplaeneStationenBerechtigung getEinsehenSchichtplaeneStationenBerechtigung() {
		return einsehenSchichtplaeneStationenBerechtigung;
	}

	public void setEinsehenSchichtplaeneStationenBerechtigung(
			EinsehenSchichtplaeneStationenBerechtigung einsehenSchichtplaeneStationenBerechtigung) {
		this.einsehenSchichtplaeneStationenBerechtigung = einsehenSchichtplaeneStationenBerechtigung;
	}

	public AusdruckenSchichtplaeneStationenBerechtigung getAusdruckenSchichtplaeneStationenBerechtigung() {
		return AusdruckenSchichtplaeneStationenBerechtigung;
	}

	public void setAusdruckenSchichtplaeneStationenBerechtigung(
			AusdruckenSchichtplaeneStationenBerechtigung ausdruckenSchichtplaeneStationenBerechtigung) {
		AusdruckenSchichtplaeneStationenBerechtigung = ausdruckenSchichtplaeneStationenBerechtigung;
	}

	public GenehmigenSchichtplanBerechtigung getGenehmigenSchichtplanBerechtigung() {
		return genehmigenSchichtplanBerechtigung;
	}

	public void setGenehmigenSchichtplanBerechtigung(GenehmigenSchichtplanBerechtigung genehmigenSchichtplanBerechtigung) {
		this.genehmigenSchichtplanBerechtigung = genehmigenSchichtplanBerechtigung;
	}

	public AnzeigenLassenGesamtansichtBerechtigung getAnzeigenLassenGesamtansichtBerechtigung() {
		return anzeigenLassenGesamtansichtBerechtigung;
	}

	public void setAnzeigenLassenGesamtansichtBerechtigung(
			AnzeigenLassenGesamtansichtBerechtigung anzeigenLassenGesamtansichtBerechtigung) {
		this.anzeigenLassenGesamtansichtBerechtigung = anzeigenLassenGesamtansichtBerechtigung;
	}

	public void setPasswort(String pw) {
		this.passwort = pw;
	}

}
