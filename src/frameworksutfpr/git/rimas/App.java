package frameworksutfpr.git.rimas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	private static int numVersos = 0;
	
	public static void main(String[] args) {
		Rimador rimador = new RimadorImpl(lerVerso());
		while(numVersos < 7){
			numVersos++;
			rimador = new RimadorDecorator(rimador, lerVerso());
		}
		rimador.versejar();
	}
	
	private static String lerVerso(){
	    try {  
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));    
	        return in.readLine();  
  
	    } catch (IOException exception) {  
	        exception.printStackTrace();  
	    }
		return "";
	}
}