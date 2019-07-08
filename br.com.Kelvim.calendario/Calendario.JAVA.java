package br.com.Kelvim.calendario;

import java.util.Date;

import br.com.Kelvim.interfaceFormatter.InterfaceFormatter;

import java.text.SimpleDateFormat;

public class Calendario extends CalendarioDisplay implements CalendarioFormater {	

	private Date data = new Date();
	SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/YYYY");
	String datacompleta = formatar.format(data);

	
	public String getData() {
		return datacompleta;
	}

	public void setData(Date data) {
		this.data = data;
		
	}

	
	public void formatter(Object data) {
		System.out.println("Calendario\nData:"+this.getData());
	    System.out.println();		
	}
	
		
	}

	
		




