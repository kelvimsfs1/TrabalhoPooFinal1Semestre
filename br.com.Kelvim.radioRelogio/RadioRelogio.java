package br.com.Kelvim.radioRelogio;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.Kelvim.display.Display;
import br.com.Kelvim.interfaceFormatter.InterfaceFormatter;

public class RadioRelogio extends RadioRelogioDisplay implements RadioRelogioFormater {
	
	private Date hora = new Date();
	SimpleDateFormat formatar = new SimpleDateFormat("HH:mm:ss");
	String horacompleta = formatar.format(hora); {
		
    }
    		
	public String getHora() {
		return horacompleta;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	
	public void formatter(Object hora) {
		System.out.println("Radio Relogio\nHora:"+this.getHora());
	    System.out.println();		
	}
	
	
		

    }


