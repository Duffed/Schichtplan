package de.rheinahrcampus.gse.schichtplan.datenbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import de.rheinahrcampus.gse.schichtplan.core.Beruf;
import de.rheinahrcampus.gse.schichtplan.core.Mitarbeiter_old;

public class MitarbeiterRepository {

	private Connection verbindung;

	public MitarbeiterRepository() {
		try {
			Class.forName("org.sqlite.JDBC");
			verbindung = DriverManager.getConnection("jdbc:sqlite::resource:Datenbank.sqlite");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Mitarbeiter_old ermittleMitarbeiterZuLogin(String username, String passwort) throws UngueltigerLoginException {
		try {
			String query = "select * from MitarbeiterInfo where username=? and password=?";
			PreparedStatement pst = verbindung.prepareStatement(query);
			pst.setString(1, username);
			pst.setString(2, passwort);

			ResultSet result = pst.executeQuery();

			Mitarbeiter_old gefundenerMitarbeiter = null;
			while (result.next()) {
				gefundenerMitarbeiter = new Mitarbeiter_old(result.getString("Name"), result.getString("Surname"),
						Beruf.ausKuerzel(result.getString("Function")), null );
			}

			if (gefundenerMitarbeiter == null) {
				throw new UngueltigerLoginException();
			}

			return gefundenerMitarbeiter;
		} catch (UngueltigerLoginException e) {
			throw e;
		} catch (Exception e) {
			throw new UngueltigerLoginException(e);
		}
	}

}
