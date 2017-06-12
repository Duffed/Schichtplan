import java.util.ArrayList;
import java.util.List;

public class Passwort {
	
	private List<Character> passwortAlsArrayList;
	
	private Passwort(List<Character> passwortAlsArrayList) {
		this.passwortAlsArrayList = passwortAlsArrayList;
	}
	
	public Passwort setPasswortAlsString(String passwort) {
		char[] passwortAlsArray = passwort.toCharArray();
		List<Character> passwortAlsArrayList = new ArrayList<>();
		for (char c : passwortAlsArray) {
			passwortAlsArrayList.add(c);
		}
		return new Passwort(passwortAlsArrayList);
	}

	public List<Character> getPasswortAlsArrayList() {
		return passwortAlsArrayList;
	}

	public void setPasswortAlsArrayList(List<Character> passwort) {
		this.passwortAlsArrayList = passwort;
	}
	
	//equals funktion

}
