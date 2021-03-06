package cl.ubb.agil;
import static org.junit.Assert.assertThat;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Test;

public class TestConversor {
	private Conversor conversor;
	
	@Before
	public void setup(){
		conversor = new Conversor();
	}
	@Test
	public void convertirUnoArabigoEnRomano(){
		
		String numero=conversor.convertirARomano(1);
		
		assertThat(numero,equalTo("I"));
	}
	
	@Test
	public void convertirDosArabigoEnRomano(){
		
		String numero=conversor.convertirARomano(2);
		
		assertThat(numero,equalTo("II"));
	}
	@Test 
	public void convertirCincoArabigoEnRomano(){
		
		String numero=conversor.convertirARomano(5);
		
		assertThat(numero,equalTo("V"));
		
	}
	@Test
	public void convertirOchoArabigoEnRomano(){
		
		String numero=conversor.convertirARomano(8);
		
		assertThat(numero,equalTo("VIII"));
	}
	
	@Test
	public void convertirDoceArabigoEnRomano(){
		
		String numero=conversor.convertirARomano(12);
		
		assertThat(numero,equalTo("XII"));
	}
	
}
