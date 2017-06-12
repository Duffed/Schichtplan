
public enum Beruf {
	
	PFLEGEDIENSTLEITUNG("PDL", "Pflegedienstleitung"),
	STATIONSLEITUNG("SL", "Stationsleitung"),
	EXAMINIERTE_PFLEGEKRAFT("EPK", "Examinierte Pflegekraft"),
	PFLEGEHELFER("PH", "Pflegehelfer"),
	PFLEGESCHUELER("PS", "Pflegeschueler"),
	SEKRETAER("S", "Sekretaer");
	
	private String kuerzel;
	private String name;
	
	private Beruf(String kuerzel, String name) {
		this.kuerzel = kuerzel;
		this.name = name;
	}

	public String getKuerzel() {
		return kuerzel;
	}
	
	public String getName() {
		return name;
	}

}
