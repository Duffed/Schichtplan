package de.rheinahrcampus.gse.schichtplan.core;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BerechtigungsTests {
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                 { Beruf.STATIONSLEITUNG, Arrays.asList(Berechtigung.SCHICHTPLAN_EINSEHEN, Berechtigung.SCHICHTPLAN_ERSTELLEN) }, 
                 { Beruf.PFLEGEKRAFT, Arrays.asList(Berechtigung.SCHICHTPLAN_EINSEHEN) }, 
                 { Beruf.EXAMINIERTE_PFLEGEKRAFT, Arrays.asList(Berechtigung.SCHICHTPLAN_EINSEHEN) }, 
                 { Beruf.PFLEGEHELFER, Arrays.asList(Berechtigung.SCHICHTPLAN_EINSEHEN) }, 
                 { Beruf.PFLEGESCHUELER, Arrays.asList(Berechtigung.SCHICHTPLAN_EINSEHEN) }, 
           });
    }
    
    @Parameter(0)
    public Beruf beruf;
    
    @Parameter(1)
    public List<Berechtigung> berechtigungen;
    
    @Test
    public void berechtigungenSolltenPassen() {
    	for(Berechtigung berechtigung : berechtigungen) {
    		assertTrue(erstelleFehlermeldung(berechtigung), beruf.hatBerechtigung(berechtigung));
    	}
    }
    
    String erstelleFehlermeldung(Berechtigung berechtigung) {
    	return "Beruf: " + beruf.toString() + " Erwartete Berechtigung: " + berechtigung.toString();
    }
}


