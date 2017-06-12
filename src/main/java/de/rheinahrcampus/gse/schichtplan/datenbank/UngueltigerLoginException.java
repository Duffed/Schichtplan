package de.rheinahrcampus.gse.schichtplan.datenbank;

public class UngueltigerLoginException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1171988072902365973L;

	public UngueltigerLoginException() {
		super("Zu den eingegebenen Credentials wurde kein Mitarbeiter gefunden");
	}

	public UngueltigerLoginException(Exception e) {
		super("Es gab einen Fehler beim Loginprozess", e);
	}

}
