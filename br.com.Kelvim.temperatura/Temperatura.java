package br.com.Kelvim.temperatura;

import br.com.Kelvim.interfaceFormatter.InterfaceFormatter;
import br.com.Kelvim.radioFm.RadioFmDisplay;

public class Temperatura extends TemperaturaDisplay implements TemperaturaFormater{
    
	
	
	private String temperatura;
		
	public String getTemperatura() {
	return temperatura;
	
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	
	public void formatter(Object temperatura) {
			System.out.println("Temperatura\n"+this.getTemperatura());
			System.out.println();
			
	}
		
	}

		
	
		




