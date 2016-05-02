package cl.ubb.agil;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Test;

public class TestConversor {

	@Test
	public void convertirUnoArabigoEnRomano(){
		Conversor conversor = new Conversor();
		
		String numero=conversor.convertirARomano(1);
		
		assertThat(numero,equalTo("I"));
	}
	
}
