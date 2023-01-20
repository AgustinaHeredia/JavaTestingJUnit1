package ListaMeses;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
class ListaMesesTest {

	

	 @Test
	    public void testListaDeMeses() {
	        ArrayList<String> year = new ArrayList<>();
	        year.add("Enero");
	        year.add("Febrero");
	        year.add("Marzo");
	        year.add("Abril");
	        year.add("Mayo");
	        year.add("Junio");
	        year.add("Julio");
	        year.add("Agosto");
	        year.add("Septiembre");
	        year.add("Octubre");
	        year.add("Noviembre");
	        year.add("Diciembre");
	        
	        Collections.sort(year);
	        
	        Assert.assertEquals(12, year.size());
	    }
	

	@Test
	void testYearNull() {
		ArrayList<String> year = new ArrayList<>();
        year.add("Enero");
        year.add("Febrero");
        year.add("Marzo");
        year.add("Abril");
        year.add("Mayo");
        year.add("Junio");
        year.add("Julio");
        year.add("Agosto");
        year.add("Septiembre");
        year.add("Octubre");
        year.add("Noviembre");
        year.add("Diciembre");
        
        Collections.sort(year);
		assertNotNull(year);
	
	}
	
	@Test
	void testAgosto() {
		ArrayList<String> year = new ArrayList<>();
        year.add("Enero");
        year.add("Febrero");
        year.add("Marzo");
        year.add("Abril");
        year.add("Mayo");
        year.add("Junio");
        year.add("Julio");
        year.add("Agosto");
        year.add("Septiembre");
        year.add("Octubre");
        year.add("Noviembre");
        year.add("Diciembre");
        
        Collections.sort(year);
		assertEquals("Agosto", year.get(7));
	}
}
