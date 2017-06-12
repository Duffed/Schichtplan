package de.rheinahrcampus.gse.schichtplan.konsole;

import java.util.Scanner;

import de.rheinahrcampus.gse.schichtplan.core.Arbeitspensum;
import de.rheinahrcampus.gse.schichtplan.core.Beruf;
import de.rheinahrcampus.gse.schichtplan.core.Mitarbeiter;
import de.rheinahrcampus.gse.schichtplan.core.Mitarbeiter_old;
import de.rheinahrcampus.gse.schichtplan.datenbank.MitarbeiterRepository;
import de.rheinahrcampus.gse.schichtplan.datenbank.UngueltigerLoginException;

public class Main {

	public static void main(String[] args) throws UngueltigerLoginException {
		
		Mitarbeiter test1 = new Mitarbeiter("Vor", "Nach", Beruf.EXAMINIERTE_PFLEGEKRAFT, "123");
		System.out.println(test1.getArbeitspensum());
		Mitarbeiter test2 = new Mitarbeiter("Vor", "Nach", Beruf.EXAMINIERTE_PFLEGEKRAFT, "123", Arbeitspensum.FUENFUNDSIEBZIG);
		System.out.println(test2.getArbeitspensum());

		System.out.println(test1.getErstellenSchichtplanBerechtigung().hatBerechtigung());
		
		Scanner scanner = new Scanner(System.in);
		MitarbeiterRepository mitarbeiterRepository = new MitarbeiterRepository();

		System.out.println("Bitte Benutzername eingeben (z.B. 1): ");
		String username = scanner.nextLine();

		System.out.println("Bitte Passwort eingeben (z.B. 1): ");
		String passwort = scanner.nextLine();

		try {
			Mitarbeiter_old mitarbeiter = mitarbeiterRepository.ermittleMitarbeiterZuLogin(username, passwort);
			System.out.println(String.format("Hallo %s %s!", mitarbeiter.getVorname(), mitarbeiter.getNachname()));
		} catch (UngueltigerLoginException e) {
			e.printStackTrace();
		}
	}

}
