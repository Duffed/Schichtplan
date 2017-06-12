
public class Mitarbeiter {
	
	private String nachname;
	private String vorname;
	private Arbeitspensum arbeitspensum;
	private Beruf beruf;
//	private String benutzername;
	private Passwort passwort;
	
	private ErstellenSchichtplanBerechtigung erstellenSchichtplanBerechtigung;

	private BereitstellenSchichtplanBerechtigung bereitstellenSchichtplanBerechtigung;

	private VeroeffentlichenSchichtplanBerechtigung veroeffentlichenSchichtplanBerechtigung;

	private FestlegenZeitspanneBerechtigung festlegenZeitspanneBerechtigung;

	private AnlegenMitarbeiterBerechtigung anlegenMitarbeiterBerechtigung;

	private BearbeitenMitarbeiterBerechtigung bearbeitenMitarbeiterBerechtigung;

	private EinsehenSchichtplaeneStationBerechtigung einsehenSchichtplaeneStationBerechtigung;

	private AusdruckenSchichtplaeneStationBerechtigung AusdruckenSchichtplaeneStationBerechtigung;

	private EinsehenSchichtplaeneStationenBerechtigung einsehenSchichtplaeneStationenBerechtigung;

	private AusdruckenSchichtplaeneStationenBerechtigung AusdruckenSchichtplaeneStationenBerechtigung;

	private GenehmigenSchichtplanBerechtigung genehmigenSchichtplanBerechtigung;

	private AnzeigenLassenGesamtansichtBerechtigung anzeigenLassenGesamtansichtBerechtigung;
	
	public Mitarbeiter() {
		//
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

	public Passwort getPasswort() {
		return passwort;
	}

	public void setPasswort(Passwort passwort) {
		this.passwort = passwort;
	}

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

	public VeroeffentlichenSchichtplanBerechtigung getVeroeffentlichenSchichtplanBerechtigung() {
		return veroeffentlichenSchichtplanBerechtigung;
	}

	public void setVeroeffentlichenSchichtplanBerechtigung(
			VeroeffentlichenSchichtplanBerechtigung veroeffentlichenSchichtplanBerechtigung) {
		this.veroeffentlichenSchichtplanBerechtigung = veroeffentlichenSchichtplanBerechtigung;
	}

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

}
