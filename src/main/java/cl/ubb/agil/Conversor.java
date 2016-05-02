package cl.ubb.agil;

public class Conversor {

	public Conversor(){
		
	}
	
	public String convertirARomano(int numero){
		String nroRomano="";
		if(numero==0){
			return nroRomano;
		}
		if(numero>=5){
			nroRomano=nroRomano+"V";
			numero=numero%5;
			return nroRomano+convertirARomano(numero);
		}else{
			nroRomano=nroRomano+"I";
			numero--;
			return nroRomano+convertirARomano(numero);
		}	
	}
	
	
}
