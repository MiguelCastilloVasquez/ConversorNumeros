package cl.ubb.agil;

public class Conversor {

	public Conversor(){
		
	}
	
	public String convertirARomano(int n){
		if(n==1){
			return "I";
		}else if(n==2){
			return "II";
		}else{
			return "V";
		}
	}
}
