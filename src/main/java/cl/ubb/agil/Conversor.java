package cl.ubb.agil;

public class Conversor {

	public Conversor(){
		
	}
	
	public String convertirARomano(int numero){
		String[] simbolos={"I","V","X"};
		int[] resto={1,5,10};
		String nroRomano="";
		if(numero==0){
			return nroRomano;
		}
		if(numero>=10){
			nroRomano=nroRomano+simbolos[2];
			numero=numero%resto[2];
			return nroRomano+convertirARomano(numero);
		}else if(numero>=5){
			nroRomano=nroRomano+simbolos[1];
			numero=numero%resto[1];
			return nroRomano+convertirARomano(numero);
		}else{
			nroRomano=nroRomano+simbolos[0];
			numero--;
			return nroRomano+convertirARomano(numero);
		}
	}
	
	
}
